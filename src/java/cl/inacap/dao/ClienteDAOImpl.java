package cl.inacap.dao;

import cl.inacap.domain.Cliente;
import cl.inacap.interfaces.dao.ClienteDAO;
import java.util.List;
import java.util.Optional;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClienteDAOImpl implements ClienteDAO {

    @PersistenceContext
    EntityManager em;

    @Override
    public Optional<Cliente> findById(int id) throws Exception {
        return Optional.of(em.find(Cliente.class, id));
    }

    @Override
    public List<Cliente> findAll() throws Exception {
        return em.createQuery("SELECT cl FROM Cliente cl ORDER BY cl.rut")
                .getResultList();
    }

    @Override
    public void save(Cliente entity) throws Exception {
        em.persist(entity);
    }

    @Override
    public void delete(int id) throws Exception {
        em.remove(em.find(Cliente.class, id));
    }

    @Override
    public void update(Cliente entity) throws Exception {
        em.merge(entity);
    }

    @Override
    public Optional<Cliente> findByRutAndPassword(int rut, String pass) throws Exception {
        return Optional.of((Cliente) em.createQuery("SELECT c FROM Cliente c WHERE c.rut = :rut AND c.pass = :pass")
                .setParameter("rut", rut)
                .setParameter("pass", pass)
                .getSingleResult());
    }

}
