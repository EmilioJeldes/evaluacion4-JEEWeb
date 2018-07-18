package cl.inacap.service;

import cl.inacap.dto.CuentaDTO;
import cl.inacap.interfaces.service.CuentaService;
import javax.ejb.Stateless;

@Stateless
public class CuentaServiceImpl implements CuentaService {

    @Override
    public void createCuenta(CuentaDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CuentaDTO findCuenta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateCuenta(CuentaDTO dto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeCuenta(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
