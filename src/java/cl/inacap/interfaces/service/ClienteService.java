package cl.inacap.interfaces.service;

import cl.inacap.dto.ClienteDTO;
import javax.ejb.Local;

/**
 *
 * @author emilio
 */
@Local
public interface ClienteService {

    void createCliente(ClienteDTO dto) throws Exception;

    ClienteDTO findCliente(int id) throws Exception;

    void updateCliente(ClienteDTO dto) throws Exception;

    void removeCliente(int id) throws Exception;

    ClienteDTO login(int rut, String pass) throws Exception;
}
