import java.util.ArrayList;
import java.util.Arrays;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 4.0);
        Item item2 = new Item("latte", 3.0);
        Item item3 = new Item("drip coffee", 2.0);
        Item item4 = new Item("capuccino", 2.5);

        // Order variables -- order1, order2 etc.

        Order order1 = new Order("Cindhuri", item2.getItemPrice(), true, new ArrayList<Item>(Arrays.asList(item2)));
        
        Order order2 = new Order("Jimmy", item1.getItemPrice(), true, new ArrayList<Item>(Arrays.asList(item1)));

        Order order3 = new Order("Noah", item4.getItemPrice(), false, new ArrayList<Item>(Arrays.asList(item4)));

        // Order order4 = new Order("Sam");
    
        // Application Simulations
        // Use this example code to test various orders' updates
        System.out.printf("Name: %s\n", order3.getOrderName());
        System.out.printf("Total: %s\n", order3.getTotal());
        System.out.printf("Items: %s\n", order3.getItems());
    }
}