package cl.inacap.interfaces.dao;

import java.util.List;
import java.util.Optional;

/**
 * Interfaz que contiene los 5 métodos crud básicos
 *
 * @author emilio
 * @param <T> entidad Genérica
 */
public interface DAO<T> {

    Optional<T> findById(int id) throws Exception;

    List<T> findAll() throws Exception;

    void save(T entity) throws Exception;

    void delete(int id) throws Exception;

    void update(T entity) throws Exception;
}
