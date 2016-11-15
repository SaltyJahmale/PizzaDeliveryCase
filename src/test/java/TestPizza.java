import controller.PizzaService;
import model.Pizza;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Created by dewi on 01.11.16.
 */
public class TestPizza {

//    @Test
//    public void createPizzaInTable() {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//        EntityManager em = emf.createEntityManager();
//
//        PizzaService ps = new PizzaService(em);
//        em.getTransaction().begin();
//        Pizza pizza = ps.createPizza("Margarita", 6.00);
//        em.getTransaction().commit();
//
//        System.out.println("Persistence = " + pizza);
//
//        em.close();
//        emf.close();
//    }
}
