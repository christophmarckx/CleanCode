package Domain;

import java.util.List;

/**
 * Created by christom on 23/02/2017.
 */
public class CustomerRepository {

    public Customer toegevoegdeCustomers(List<Customer> toegevoegdeCustomers) {
        Customer customer = new Customer();

        for (Customer aCustomer:toegevoegdeCustomers) {
            CustomerService.addCustomer(aCustomer);

        }
        return customer ;
    }
}
