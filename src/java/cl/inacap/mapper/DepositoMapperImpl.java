package cl.inacap.mapper;

import cl.inacap.domain.Deposito;
import cl.inacap.dto.DepositoDTO;
import cl.inacap.interfaces.mapper.DepositoMapper;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;

@Stateless
public class DepositoMapperImpl implements DepositoMapper {

    @Override
    public DepositoDTO requestToDTO(HttpServletRequest request) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public DepositoDTO domainToDTO(Deposito domain) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Deposito dtoToDomain(DepositoDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
