package controller;

import ejb.CustomerEJB;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.Customer;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.util.List;

/**
 * Created by dewi on 31.10.16.
 */
@Named
@RequestScoped
@NoArgsConstructor
@Data
public class CustomerService {

    private Customer customer = new Customer();

    @EJB
    private CustomerEJB customerEJB;

    public List<Customer> getAllCustomers() {
        return customerEJB.getAllCustomers();
    }

    public String createUser() {
        customerEJB.insertCustomer(customer);
        return "addCustomer";
    }

}
