package Domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wouterba on 23/02/2017.
 */
public class Groceries {
    private Map<String, Integer> items;

    public Groceries() {
        items = new HashMap<>();
    }

    public void addItemtoGroceries(String item, int amount) {
        items.put(item,amount);
    }
}
