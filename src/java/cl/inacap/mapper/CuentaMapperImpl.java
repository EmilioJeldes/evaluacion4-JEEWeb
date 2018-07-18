/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.inacap.mapper;

import cl.inacap.domain.Cuenta;
import cl.inacap.dto.CuentaDTO;
import cl.inacap.interfaces.mapper.CuentaMapper;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;

@Stateless
public class CuentaMapperImpl implements CuentaMapper {

    @Override
    public CuentaDTO requestToDTO(HttpServletRequest request) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Cuenta dtoToDomain(CuentaDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CuentaDTO domainToDTO(Cuenta domain) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
