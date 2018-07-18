package cl.inacap.interfaces.mapper;

import cl.inacap.domain.Cuenta;
import cl.inacap.dto.CuentaDTO;
import javax.ejb.Local;

/**
 *
 * @author emilio
 */
@Local
public interface CuentaMapper extends Mapper<CuentaDTO, Cuenta> {

}
