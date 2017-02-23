package Domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by christom on 23/02/2017.
 */
public class CustomerRepository {

    List<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public List<Customer> getCustomers(){
        return customers;
    }
}
