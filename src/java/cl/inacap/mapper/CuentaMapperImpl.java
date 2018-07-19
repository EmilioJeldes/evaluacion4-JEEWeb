package cl.inacap.mapper;

import cl.inacap.domain.Cuenta;
import cl.inacap.domain.TipoCuenta;
import cl.inacap.dto.ClienteDTO;
import cl.inacap.dto.CuentaDTO;
import cl.inacap.interfaces.mapper.ClienteMapper;
import cl.inacap.interfaces.mapper.CuentaMapper;
import java.sql.Date;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.servlet.http.HttpServletRequest;

@Stateless
public class CuentaMapperImpl implements CuentaMapper {

    @EJB
    ClienteMapper clienteMapper;

    @Override
    public CuentaDTO requestToDTO(HttpServletRequest request) {
        if (request == null) {
            return null;
        }

        String numeroCuentaString = request.getParameter("numeroCuenta");
        String fechaAperturaString = request.getParameter("fechaApertura");
        String saldoDisponibleString = (request.getParameter("saldoDisponible"));
        String tipoCuenta = request.getParameter("tipoCuenta");
        ClienteDTO cliente = (ClienteDTO) request.getSession().getAttribute("cliente");

        System.out.println("**********************");
        System.out.println("NUMERO CUENTA STRING");
        System.out.println(numeroCuentaString);
        System.out.println("**********************");
        
        CuentaDTO dto = new CuentaDTO();

        if (numeroCuentaString != null && "".equals(numeroCuentaString) == false) {
            dto.setNumeroCuenta(Integer.parseInt(numeroCuentaString));
        }

        if (fechaAperturaString != null && "".equals(fechaAperturaString) == false) {
            dto.setFechaApertura(Date.valueOf(fechaAperturaString));
        }

        if (saldoDisponibleString != null && "".equals(saldoDisponibleString) == false) {
            dto.setSaldoDisponible(Integer.parseInt(saldoDisponibleString));
        }

        if (tipoCuenta != null && "".equals(tipoCuenta) == false) {
            dto.setTipoCuenta(TipoCuenta.valueOf(tipoCuenta));
        }
        dto.setCliente(cliente);

        return dto;
    }

    @Override
    public Cuenta dtoToDomain(CuentaDTO dto) throws Exception {
        if (dto == null) {
            return null;
        }

        Cuenta domain = new Cuenta();

        domain.setCliente(clienteMapper.dtoToDomain(dto.getCliente()));
        domain.setFechaApertura(dto.getFechaApertura());
        domain.setNumeroCuenta(dto.getNumeroCuenta());
        domain.setSaldoDisponible(dto.getSaldoDisponible());
        domain.setTipoCuenta(dto.getTipoCuenta());

        return domain;

    }

    @Override
    public CuentaDTO domainToDTO(Cuenta domain) throws Exception {
        if (domain == null) {
            return null;
        }

        CuentaDTO dto = new CuentaDTO();

        dto.setCliente(clienteMapper.domainToDTO(domain.getCliente()));
        dto.setFechaApertura(dto.getFechaApertura());
        dto.setNumeroCuenta(dto.getNumeroCuenta());
        dto.setSaldoDisponible(dto.getSaldoDisponible());
        dto.setTipoCuenta(dto.getTipoCuenta());

        return dto;
    }

}
