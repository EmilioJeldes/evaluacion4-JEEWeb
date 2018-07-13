package cl.inacap.domain;

import java.io.Serializable;
import java.sql.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author emilio
 */
@Data
@Entity
public class Cuenta implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "numero_cuenta")
    private Integer numeroCuenta;

    @Column(name = "fecha_apertura", nullable = false)
    private Date fechaApertura;

    @Column(name = "tipo_cuenta", nullable = false)
    private TipoCuenta tipoCuenta;

    @OneToOne
    @JoinColumn(name = "rut", nullable = false)
    private Cliente cliente;

    @Column(name = "saldo_disponible", nullable = false)
    private Integer saldoDisponible;

}
