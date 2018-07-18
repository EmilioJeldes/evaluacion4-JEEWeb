package cl.inacap.dao;

import cl.inacap.domain.Cuenta;
import cl.inacap.interfaces.dao.CuentaDAO;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CuentaDAOImpl implements CuentaDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public Optional<Cuenta> findById(int id) throws Exception {
        return Optional.of(em.find(Cuenta.class, id));
    }

    @Override
    public List<Cuenta> findAll() throws Exception {
        return em.createQuery("SELECT c FROM Cuenta c ORDER BY c.numeroCuenta")
                .getResultList();
    }

    @Override
    public void save(Cuenta entity) throws Exception {
        em.persist(entity);
    }

    @Override
    public void delete(int id) throws Exception {
        em.remove(em.find(Cuenta.class, id));
    }

    @Override
    public void update(Cuenta entity) throws Exception {
        em.merge(entity);
    }

}
