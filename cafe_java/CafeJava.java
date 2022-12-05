public class CafeJava {
    public static void main(String[] args) {

        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        double mochaPrice = 3.5;
        double lattePrice = 3.0;
        double cappucinoPrice = 2.5;
        double coffeePrice = 2.0;
    
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder3 = true;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Cindhuri's order
        System.out.println(generalGreeting + customer1);
        System.out.println(customer1 + (isReadyOrder1 ? readyMessage : pendingMessage));

        // Noah's order
        if (isReadyOrder4) {
            Double noahTotal = cappucinoPrice;
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + noahTotal);
        }
        else {
            System.out.println(customer4 + pendingMessage);
        }

        // Sam's order
        Double samTotal = lattePrice * 2;
        System.out.println(displayTotalMessage + samTotal);
        System.out.println(customer2 + (isReadyOrder2 ? readyMessage : pendingMessage));

        // Jimmy's order
        Double jimmyTotal = lattePrice - coffeePrice;
        System.out.println(displayTotalMessage + jimmyTotal);
    }
}