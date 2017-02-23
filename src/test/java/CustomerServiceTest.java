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
        testCustomer = new Customer(1,"Joe", new LoyaltyCard());
        service = new CustomerService();
        service.addCustomer(testCustomer);
    }

    @Test
    public void findByBarCodeTest(){
        LoyaltyCard lc = new LoyaltyCard();
        Customer wouter = new Customer(2, "Wouter", lc);
        service.addCustomer(wouter);
        Assertions.assertThat(service.findCustomerByBarcode(lc.getBarCode()).get()).isEqualTo(wouter);
    }
}
