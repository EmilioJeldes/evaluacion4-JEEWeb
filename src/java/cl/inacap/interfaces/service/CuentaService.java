package cl.inacap.interfaces.service;

import cl.inacap.dto.CuentaDTO;
import javax.ejb.Local;

/**
 *
 * @author emilio
 */
@Local
public interface CuentaService {

    void createCuenta(CuentaDTO dto) throws Exception;

    CuentaDTO findCuenta(int id);

    void updateCuenta(CuentaDTO dto);

    void removeCuenta(int id);

    CuentaDTO findByClient(int id);

}
