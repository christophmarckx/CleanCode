package Domain;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

public class Customer {

    private int id;
    private String name;
    private LoyaltyCard customerCard;
    private Map<LocalDate, Groceries> groceries;

    public Customer(int id, String name, LoyaltyCard customerCard) {
        this.id = id;
        this.name = name;
        this.customerCard = customerCard;
        this.groceries = new TreeMap<>();
    }

    public String getCustomerBarCode() {
        return customerCard.getBarCode();
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (name != null ? !name.equals(customer.name) : customer.name != null) return false;
        if (customerCard != null ? !customerCard.equals(customer.customerCard) : customer.customerCard != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (customerCard != null ? customerCard.hashCode() : 0);
        return result;
    }

    public void addGroceries(LocalDate date, Groceries groceries) {
        this.groceries.put(date, groceries);
    }

    public Groceries getGroceriesForDay(LocalDate date) {
        return groceries.get(date);
    }
}
