import java.util.ArrayList;
import java.util.Arrays;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha", 4.0);
        Item item2 = new Item("latte", 3.0);
        Item item3 = new Item("drip coffee", 2.0);
        Item item4 = new Item("capuccino", 2.5);

        // Order variables

        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Noah");
        Order order4 = new Order("Sam");
        Order order5 = new Order("Jimmy");

        // Application Simulations

        System.out.printf("Test: %s\n", order1.getItems());
        order1.addItem(item3);
        order1.addItem(item1);
        order2.setReady(true);
        System.out.printf("Test: %s\n", order1.getItems());
        System.out.printf("Ready? %s\n", order2.getStatusMessage());
        System.out.printf("Total: %s0\n", order1.getOrderTotal());
        order5.display();
        System.out.println(order1.getOrderTotal());
    }
}