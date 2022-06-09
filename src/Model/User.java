package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class User {
    private ArrayList<Cart> carts;
    private final String id;
    private double balance = 0;


    public User() {
        this.id = UUID.randomUUID().toString();
        this.carts = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(int change) {
        this.balance += change;
    }

    public void decreaseBalance(int change) {
        this.balance -= change;
    }

    public void addToCarts(Cart cart) {
        this.carts.add(cart);
    }
}
