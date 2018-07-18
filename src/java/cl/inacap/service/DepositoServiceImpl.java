package cl.inacap.service;

import cl.inacap.dto.DepositoDTO;
import cl.inacap.interfaces.service.DepositoService;
import java.util.List;
import javax.ejb.Stateless;

@Stateless
public class DepositoServiceImpl implements DepositoService {

    @Override
    public void createDeposito(DepositoDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DepositoDTO findDeposito(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<DepositoDTO> findAllDepositos() throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDeposito(DepositoDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeDeposito(int id) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
