import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal(int numWeeks) {
        int count = 0;
        for (int i = 1; i < numWeeks + 1; i++) {
            count += i;
        }
        return count;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for (int i = 0; i < prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menu) {
        for (int i = 0; i < menu.size(); i++) {
            System.out.println(i + " " + menu.get(i));
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name: ");
        String userName = System.console().readLine();
        customers.add(userName);
        System.out.println("Hello, " + userName + "!");
    }

}