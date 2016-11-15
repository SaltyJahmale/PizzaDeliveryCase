import controller.CustomerService;
import controller.OrdersService;
import model.Customer;
import model.Orders;
import org.junit.Test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.sql.Date;
import java.time.LocalDate;


/**
 * Created by dewi on 02.11.16.
 */
public class TestScenarioCase {

//    @Test
//    public void scenarioAddingCustomerToOrder() {
//
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("my-pu");
//        EntityManager em = emf.createEntityManager();
//
//        LocalDate localDate = LocalDate.now();
//        CustomerService cs = new CustomerService(em);
//        Customer customer = cs.createCustomer("Martin", "0123456789");
//        OrdersService os = new OrdersService(em);
//
//        em.getTransaction().begin();
//        Orders orders = os.createOrders(customer, Date.valueOf(localDate));
//        em.getTransaction().commit();
//
//        System.out.println("orders = " + orders);
//
//        em.close();
//        emf.close();
//
//     }

}
