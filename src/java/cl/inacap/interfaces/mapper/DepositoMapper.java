package cl.inacap.interfaces.mapper;

import cl.inacap.domain.Deposito;
import cl.inacap.dto.DepositoDTO;
import javax.ejb.Local;

/**
 *
 * @author emilio
 */
@Local
public interface DepositoMapper extends Mapper<DepositoDTO, Deposito> {

}
