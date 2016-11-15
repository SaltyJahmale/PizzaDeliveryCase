package random;

import ejb.PizzaEJB;
import model.Pizza;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ejb.Startup;
import javax.inject.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by dewi on 14.11.16.
 */

@Singleton
@Startup
public class SingletonBean {

    @PostConstruct
    private void initIt() {
        PizzaEJB pizzaEJB = new PizzaEJB();

        Pizza pizza1 = new Pizza(1, "Fungi", 12.50);
        pizzaEJB.insertPizza(pizza1);

        Pizza pizza2 = new Pizza(2, "Margarita", 10.00);
        pizzaEJB.insertPizza(pizza2);

        Pizza pizza3 = new Pizza(3, "Salami", 11.00);
        pizzaEJB.insertPizza(pizza3);

        Pizza pizza4 = new Pizza(4, "Hawaii", 13.50);
        pizzaEJB.insertPizza(pizza4);

        Pizza pizza5 = new Pizza(5, "Turkse", 9.00);
        pizzaEJB.insertPizza(pizza5);

    }

    @PreDestroy
    private void cleanUp() {
        System.out.println("Invoking method: preDestroy()");

    }

}
