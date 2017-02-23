import Domain.Customer;
import Domain.CustomerService;
import Domain.LoyaltyCard;
import static org.junit.Assert.assertThat;

import com.sun.org.apache.xpath.internal.operations.Equals;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by christom on 23/02/2017.
 */
public class CustomerServiceTest {

    @Test
    public void findByBarCodeTest(){
        Customer testCustomer = new Customer(1,"Joe", new LoyaltyCard(556,1));
        CustomerService service = new CustomerService();
        service.addCustomer(testCustomer);

        assertThat(service.findByBarCode(556));

    }
}
