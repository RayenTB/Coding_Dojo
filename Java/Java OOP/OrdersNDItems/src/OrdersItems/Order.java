package OrdersItems;

import java.util.ArrayList;

public class Order {
    String name;                  // Customer's name
    double total = 0.0;           // Total order cost
    boolean ready = false;        // Order ready status
    ArrayList<Item> items = new ArrayList<>(); // List of items in the order
}
