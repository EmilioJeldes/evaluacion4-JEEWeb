package cl.inacap.domain;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import lombok.Data;

/**
 *
 * @author emilio
 */
@Data
@Entity
public class Cliente implements Serializable {

    private static final long serialVersionUID = -4937266737901136707L;

    @Id
    private Integer rut;
    private String nombre;
    private String apellido;
    private String pass;
    private String email;
    private Integer cel;

    @OneToOne(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Cuenta cuenta;

}
