package Domain;

import org.assertj.core.api.Assertions;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

/**
 * Created by wouterba on 23/02/2017.
 */
public class CustomerTest {
    private Customer testCustomer;

    @Before
    public void setUp(){
        testCustomer = new Customer(1, "Wouter", new LoyaltyCard());
    }

    @Test
    public void addGroceries_GroceriesSavedByDay_GetGroceriesForDayShouldBeEqual(){
        Groceries groceries = new Groceries();

        testCustomer.addGroceries(LocalDate.now(), groceries);

        Assertions.assertThat(testCustomer.getGroceriesForDay(LocalDate.now())).isEqualTo(groceries);
    }

    @Test
    public void addGroceries_ifDateIsAlreadyPresentAddItemsToExistingGroceries_testShouldReturnTrue(){
        Groceries groceries = new Groceries();
        groceries.addItemtoGroceries("beer", 5);
        groceries.addItemtoGroceries("candy", 2);

        testCustomer.addGroceries(LocalDate.now(), groceries);
        testCustomer.addGroceries(LocalDate.now(), groceries);

        Assertions.assertThat(testCustomer.getGroceriesForDay(LocalDate.now())).isEqualTo(groceries);
    }
}