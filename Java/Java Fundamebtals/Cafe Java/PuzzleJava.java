public class PuzzleJava {
    /**
     * @param args
     */
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app.
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";

        double dripCoffeePrice = 2.0;
        double lattePrice = 4.0;
        double cappuccinoPrice = 4.5;

        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";

        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = true;
        boolean isReadyOrder4 = true;

        // APP INTERACTION SIMULATION (Add your code for the challenges below)

        // Customer 1 interaction
        System.out.println(generalGreeting + customer1);
        if (isReadyOrder1) {
            System.out.println(customer1 + readyMessage);
        } else {
            System.out.println(customer1 + pendingMessage);
        }

        // Customer 4 orders a cappuccino
        System.out.println(generalGreeting + customer4);
        if (isReadyOrder4) {
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        } else {
            System.out.println(customer4 + pendingMessage);
        }

        // Customer 2 orders 2 lattes and checks the total price
        System.out.println(generalGreeting + customer2);
        System.out.println(displayTotalMessage + (2 * lattePrice));
        if (isReadyOrder2) {
            System.out.println(customer2 + readyMessage);
        } else {
            System.out.println(customer2 + pendingMessage);
        }

        // Customer 3 was charged for a latte but ordered a drip coffee
        System.out.println(generalGreeting + customer3);
        System.out.println("Your total was overcharged by $" + (lattePrice - dripCoffeePrice));
    }
}
