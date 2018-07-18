package cl.inacap.service;

import cl.inacap.domain.Cliente;
import cl.inacap.dto.ClienteDTO;
import cl.inacap.interfaces.dao.ClienteDAO;
import cl.inacap.interfaces.mapper.ClienteMapper;
import cl.inacap.interfaces.service.ClienteService;
import java.util.Optional;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ClienteServiceImpl implements ClienteService {

    @EJB
    ClienteDAO dao;

    @EJB
    ClienteMapper mapper;

    @Override
    public void createCliente(ClienteDTO dto) throws Exception {
        dao.save(mapper.dtoToDomain(dto));
    }

    @Override
    public ClienteDTO findCliente(int id) throws Exception {
        Optional<Cliente> clienteOptional = dao.findById(id);
        if (clienteOptional.isPresent()) {
            return mapper.domainToDTO(clienteOptional.get());
        } else {
            throw new Exception("No se encontró un cliente con ese rut");
        }
    }

    @Override
    public void updateCliente(ClienteDTO dto) throws Exception {
        dao.update(mapper.dtoToDomain(dto));
    }

    @Override
    public void removeCliente(int id) throws Exception {
        dao.delete(id);
    }

    @Override
    public ClienteDTO login(int rut, String pass) throws Exception {
        Optional<Cliente> optionalCliente = dao.findByRutAndPassword(rut, pass);
        if (optionalCliente.isPresent()) {
            return mapper.domainToDTO(optionalCliente.get());
        } else {
            throw new Exception("Usuario y contraseña incorrectos");
        }
    }

}
