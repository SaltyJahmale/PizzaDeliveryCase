package model;

import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * Created by dewi on 31.10.16.
 */
@Entity
@NoArgsConstructor
@NamedQuery(name = "findAllCustomers", query = "SELECT e FROM Customer e")
public class Customer implements Serializable {

    @Id
    @SequenceGenerator(name = "CustomerSeq", sequenceName = "APP_CUS_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CustomerSeq")
    private long id;
    private String name;
    private String phoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List<Orders> orders;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }
}
