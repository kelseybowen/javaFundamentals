public class Item {
    private String name;
    private double price;

    public Item(){};
    public Item(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getItemName() {
        return name;
    }

    public void setItemName(String name) {
        this.name = name;
    } 

    public double getItemPrice() {
        return price;
    }

    public void setItemPrice(double price) {
        this.price = price;
    } 
}
