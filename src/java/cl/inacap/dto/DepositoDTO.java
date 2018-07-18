package cl.inacap.dto;

import cl.inacap.domain.TipoCuenta;
import java.sql.Date;
import lombok.Data;

/**
 *
 * @author emilio
 */
@Data
public class DepositoDTO {

    private Integer idDeposito;
    private CuentaDTO numeroCuenta;
    private TipoCuenta tipoCuenta;
    private Integer monto;
    private Date fecha;

}
