package controller;

import ejb.PizzaEJB;
import eventhandler.OrderReceiver;
import eventhandler.OrderSender;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Pizza;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by dewi on 01.11.16.
 */
@Named
@RequestScoped
@NoArgsConstructor
@Data
public class PizzaService {

    private Pizza pizza = new Pizza();
    OrderReceiver orderReceiver = new OrderReceiver();
    OrderSender orderSender = new OrderSender();

    @EJB
    private PizzaEJB pizzaEJB;

    public List<Pizza> getAllPizzas() {
        return pizzaEJB.getAllPizzas();
    }

    public String createPizza() {
        pizzaEJB.insertPizza(pizza);
        return "addProduct";
    }

}
