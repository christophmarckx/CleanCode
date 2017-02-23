import Domain.Customer;
import Domain.CustomerService;
import Domain.LoyaltyCard;
import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

public class CustomerServiceTest {
    private Customer testCustomer;
    private CustomerService service;

    @Before
    public void setUp(){
        testCustomer = new Customer(1,"Joe", new LoyaltyCard(556,1));
        service = new CustomerService();
        service.addCustomer(testCustomer);
    }

    @Test
    public void findByBarCodeTest(){
        Assertions.assertThat(service.findCustomerByBarcode(556).get()).isEqualTo(testCustomer);
    }
}
