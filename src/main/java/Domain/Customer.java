package Domain;

/**
 * Created by christom on 23/02/2017.
 */
public class Customer {
    private String name;
    private String barcode;

    public Customer() {
        this.name = null;
        this.barcode = null;
    }

    public Customer(String name, String barcode) {
        this.name = name;
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }


}
