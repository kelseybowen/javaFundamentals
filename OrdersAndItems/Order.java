import java.util.ArrayList;

public class Order {
    private String name;
    private boolean isReady = false;
    private ArrayList<Item> items;

    public Order(){
        this.name = "Guest";
        this.isReady = false;
        this.items = new ArrayList<Item>();
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<Item>();
        this.isReady = false;
    }

    // CLASS METHODS
    public void addItem(Item item) {
        this.items.add(item);
    }

    public String getStatusMessage() {
        if (this.isReady) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0.0;
        for (Item item : this.items) {
            total += item.getItemPrice();
        }
        return total;
    }

    public void display() {
        ArrayList<String> orderItems = this.getItems();
        System.out.printf("Customer Name: %s\n", this.getOrderName());
        for (int i=0; i < orderItems.size(); i++) {
            System.out.println(orderItems.get(i));
        }
        System.out.printf("Total: $%,.2f\n", this.getOrderTotal());
    }

    // GETTERS & SETTERS

    public String getOrderName() {
        return name;
    }

    public void setOrderName(String name) {
        this.name = name;
    } 

    public boolean getReady() {
        return isReady;
    }

    public void setReady(boolean isReady) {
        this.isReady = isReady;
    }

    public ArrayList<String> getItems() {
        ArrayList<String> orderItems = new ArrayList<String>();
        for (Item item : this.items) {
            orderItems.add(item.getItemName() + " - $" + item.getItemPrice() + "0");
        }
        return orderItems;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }
}
