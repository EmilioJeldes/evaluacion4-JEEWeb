package cl.inacap.interfaces.dao;

import cl.inacap.domain.Cliente;
import java.util.Optional;
import javax.ejb.Local;

/**
 *
 * @author emilio
 */
@Local
public interface ClienteDAO extends DAO<Cliente> {

    Optional<Cliente> findByRutAndPassword(int rut, String pass) throws Exception;
}
