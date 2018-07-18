package cl.inacap.dao;

import cl.inacap.domain.Deposito;
import cl.inacap.interfaces.dao.DepositoDAO;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class DepositoDAOImpl implements DepositoDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public Optional<Deposito> findById(int id) throws Exception {
        return Optional.of(em.find(Deposito.class, id));
    }

    @Override
    public List<Deposito> findAll() throws Exception {
        return em.createQuery("SELECT p FROM Deposito p ORDER BY p.fecha")
                .getResultList();
    }

    @Override
    public void save(Deposito entity) throws Exception {
        em.persist(entity);
    }

    @Override
    public void delete(int id) throws Exception {
        em.remove(em.find(Deposito.class, id));
    }

    @Override
    public void update(Deposito entity) throws Exception {
        em.merge(entity);
    }

}
