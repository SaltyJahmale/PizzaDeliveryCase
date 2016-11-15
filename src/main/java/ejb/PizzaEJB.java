package ejb;

import interceptor.MyInterceptorBinding;
import interceptor.TestInterceptor;
import model.Pizza;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Stateless;
import javax.interceptor.Interceptors;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by dewi on 09.11.16.
 */
@Stateless
@MyInterceptorBinding
@Interceptors(TestInterceptor.class)
public class PizzaEJB {

    @PersistenceContext(unitName = "my-pu")
    private EntityManager em;

    @PostConstruct
    public void init() {
        System.out.println("SessionBean: " + this.toString());
        System.out.println("EntityManager: " + em.toString());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Invoking method: preDestroy()");
    }

    public List<Pizza> getAllPizzas() {
        TypedQuery<Pizza> query = em.createNamedQuery("findAllPizzas", Pizza.class);
        return query.getResultList();
    }

    public Pizza insertPizza(Pizza pizza) {
        em.persist(pizza);
        return pizza;
    }


}
