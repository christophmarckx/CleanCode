package Domain;

import Domain.Customer;

/**
 * Created by christom on 23/02/2017.
 */
public class CustomerService {

    CustomerRepository repository;

    public void addCustomer(Customer aCustomer) {
        repository.addCustomer(aCustomer);
    }

    public Customer findByBarCode(long barCode){

        for (Customer customer:repository.getCustomers()) {
            if (customer.getCustomerBarCode() == barCode){return customer;}
        }
        return null;
    }
}
