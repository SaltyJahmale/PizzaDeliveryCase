package model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by dewi on 27.10.16.
 */
@Entity
@NoArgsConstructor
@AllArgsConstructor
@NamedQuery(name = "findAllPizzas", query = "SELECT e FROM Pizza e ")
public class Pizza implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PizzaSeq")
    @SequenceGenerator(name = "PizzaSeq", sequenceName = "APP_PIZ_SEQ", allocationSize = 1)
    private long id;
    private String pizzaName;
    private double price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPizzaName() {
        return pizzaName;
    }

    public void setPizzaName(String pizzaName) {
        this.pizzaName = pizzaName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
