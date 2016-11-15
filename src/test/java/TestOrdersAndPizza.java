import controller.PizzaService;
import model.Orders;
import model.Pizza;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by dewi on 02.11.16.
 */
public class TestOrdersAndPizza {

//    @Test
//    public void test() {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//        EntityManager em = emf.createEntityManager();
//
//        em.getTransaction().begin();
//        PizzaService pizzaService = new PizzaService(em);
//
//        Orders orders = new Orders();
//
//        Pizza pizzaById1 = pizzaService.findPizzaById(1);
//        Pizza pizzaById2 = pizzaService.findPizzaById(2);
//
//        List<Pizza> pizzaList = new ArrayList();
//        pizzaList.add(pizzaById1);
//        pizzaList.add(pizzaById2);
//
//        orders.getId();
//        orders.setPizzas(pizzaList);
//
//        em.persist(orders);
//
//        em.getTransaction().commit();
//
//
//        em.close();
//        emf.close();
//    }

}
