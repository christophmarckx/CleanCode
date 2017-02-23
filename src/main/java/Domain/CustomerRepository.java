package Domain;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository {

    private List<Customer> customers = new ArrayList<Customer>();

    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    public List<Customer> getCustomers(){
        return customers;
    }
}
