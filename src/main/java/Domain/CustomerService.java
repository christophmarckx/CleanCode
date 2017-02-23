package Domain;

import java.util.Optional;

public class CustomerService {

    private CustomerRepository repository = new CustomerRepository();

    public void addCustomer(Customer aCustomer) {
        repository.addCustomer(aCustomer);
    }

    public Optional<Customer> findCustomerByBarcode(long barCode){

        return repository.getCustomers().stream()
                                        .filter(c->c.getCustomerBarCode()==barCode)
                                        .findFirst();
    }
}
