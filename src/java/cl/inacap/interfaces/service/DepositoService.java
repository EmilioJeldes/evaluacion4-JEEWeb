package cl.inacap.interfaces.service;

import cl.inacap.dto.DepositoDTO;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author emilio
 */
@Local
public interface DepositoService {

    void createDeposito(DepositoDTO dto) throws Exception;

    DepositoDTO findDeposito(int id) throws Exception;

    List<DepositoDTO> findAllDepositos() throws Exception;

    void updateDeposito(DepositoDTO dto) throws Exception;

    void removeDeposito(int id) throws Exception;

}
