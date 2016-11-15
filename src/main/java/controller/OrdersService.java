package controller;

import model.Customer;
import model.Orders;
import model.Pizza;

import javax.persistence.EntityManager;
import java.util.Date;
import java.util.List;


/**
 * Created by dewi on 02.11.16.
 */

public class OrdersService {

    private EntityManager em;

    public OrdersService(EntityManager em) {
        this.em = em;
    }

    public Orders createOrders(Customer customerId, Date date) {
        Orders orders = new Orders();
        orders.setCustomer(customerId);
        orders.setDate(date);
        em.persist(orders);

        return orders;

    }

    public List<Pizza> getAllPizzaOrders() {
        Orders orders = new Orders();
        return orders.getPizzas();
    }
}
