package ejb;

import model.Customer;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by dewi on 07.11.16.
 */

@Stateless
public class CustomerEJB {

    @PersistenceContext(unitName = "my-pu")
    private EntityManager em;

    public List<Customer> getAllCustomers() {
        TypedQuery<Customer> query = em.createNamedQuery("findAllCustomers", Customer.class);
        return query.getResultList();
    }

    public Customer insertCustomer(Customer customer){
        em.persist(customer);
        return customer;
    }
}
