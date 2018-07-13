package cl.inacap.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.Data;

/**
 *
 * @author emilio
 */
@Data
@Entity
public class Deposito implements Serializable {

    private static final long serialVersionUID = 4649218345748746501L;

    @Id
    @Column(name = "id_deposito")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDeposito;
    
    @ManyToOne
    private Integer numeroCuenta;
    private TipoCuenta tipoCuenta;
    private Integer monto;
    private Date fecha;

}
