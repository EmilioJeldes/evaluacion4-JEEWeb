package cl.inacap.interfaces.mapper;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author emilio
 */
public interface Mapper<DTO, DOMAIN> {

    DTO requestToDTO(HttpServletRequest request) throws Exception;

    DTO domainToDTO(DOMAIN domain) throws Exception;

    DOMAIN dtoToDomain(DTO dto) throws Exception;

}
