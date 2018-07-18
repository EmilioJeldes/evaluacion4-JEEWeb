package cl.inacap.interfaces.mapper;

import cl.inacap.domain.Cliente;
import cl.inacap.dto.ClienteDTO;
import javax.ejb.Local;

/**
 *
 * @author emilio
 */
@Local
public interface ClienteMapper extends Mapper<ClienteDTO, Cliente> {

}
