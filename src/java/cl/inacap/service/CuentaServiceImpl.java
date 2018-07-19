package cl.inacap.service;

import cl.inacap.dto.CuentaDTO;
import cl.inacap.interfaces.dao.CuentaDAO;
import cl.inacap.interfaces.mapper.CuentaMapper;
import cl.inacap.interfaces.service.CuentaService;
import java.sql.Date;
import java.time.LocalDate;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class CuentaServiceImpl implements CuentaService {

    @EJB
    CuentaDAO cuentaDAO;

    @EJB
    CuentaMapper mapper;

    @Override
    public void createCuenta(CuentaDTO dto) throws Exception {
        dto.setFechaApertura(Date.valueOf(LocalDate.now()));
        cuentaDAO.save(mapper.dtoToDomain(dto));
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

    @Override
    public CuentaDTO findByClient(int id) {
        try {
            return mapper.domainToDTO(cuentaDAO.findBydClientId(id));
        } catch (Exception ex) {
            ex.getStackTrace();
            return null;
        }
    }

}
