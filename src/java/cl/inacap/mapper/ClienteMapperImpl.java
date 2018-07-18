package cl.inacap.mapper;

import cl.inacap.domain.Cliente;
import cl.inacap.dto.ClienteDTO;
import cl.inacap.interfaces.mapper.ClienteMapper;
import com.sun.istack.Nullable;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;

@Stateless
public class ClienteMapperImpl implements ClienteMapper {

    @Override
    public ClienteDTO requestToDTO(HttpServletRequest request) throws Exception {
        if (request == null) {
            return null;
        }

        @Nullable
        int idUsuario = Integer.parseInt(request.getParameter("rut"));
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String email = request.getParameter("email");
        String contraseña = request.getParameter("password");
        @Nullable
        int cel = Integer.parseInt(request.getParameter("cel"));

        ClienteDTO dto = new ClienteDTO();
        if (request.getParameter("rut") != null) {
            dto.setRut(idUsuario);
        }
        if (nombre != null) {
            dto.setNombre(nombre);
        }
        if (apellido != null) {
            dto.setApellido(apellido);
        }
        if (email != null) {
            dto.setEmail(email);
        }
        if (contraseña != null) {
            dto.setPass(contraseña);
        }
        if (request.getParameter("cel") != null) {
            dto.setCel(cel);
        }
        return dto;

    }

    @Override
    public Cliente dtoToDomain(ClienteDTO dto) throws Exception {
        if (dto == null) {
            return null;
        }

        Cliente cliente = new Cliente();
        cliente.setApellido(dto.getApellido());
        cliente.setPass(dto.getPass());
        cliente.setRut(dto.getRut());
        cliente.setNombre(dto.getNombre());
        cliente.setCel(dto.getCel());
        cliente.setEmail(dto.getEmail());

        return cliente;
    }

    @Override
    public ClienteDTO domainToDTO(Cliente domain) throws Exception {
        if (domain == null) {
            return null;
        }

        ClienteDTO dto = new ClienteDTO();
        dto.setApellido(domain.getApellido());
        dto.setPass(domain.getPass());
        dto.setRut(domain.getRut());
        dto.setNombre(domain.getNombre());
        dto.setCel(domain.getCel());
        dto.setEmail(domain.getEmail());

        return dto;
    }
}
