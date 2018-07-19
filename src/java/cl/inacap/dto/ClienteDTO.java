package cl.inacap.dto;

import lombok.Data;

/**
 *
 * @author emilio
 */
@Data
public class ClienteDTO {

    private Integer rut;
    private String nombre;
    private String apellido;
    private String pass;
    private String email;
    private Integer cel;
    private CuentaDTO cuenta;

}
