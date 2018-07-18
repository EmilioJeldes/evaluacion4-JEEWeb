package cl.inacap.dto;

import cl.inacap.domain.TipoCuenta;
import java.sql.Date;
import lombok.Data;

/**
 *
 * @author emilio
 */
@Data
public class CuentaDTO {

    private Integer numeroCuenta;
    private Date fechaApertura;
    private TipoCuenta tipoCuenta;
    private ClienteDTO cliente;
    private Integer saldoDisponible;

}
