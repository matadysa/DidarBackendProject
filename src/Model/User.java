package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class User {
<<<<<<< HEAD
    private ArrayList<Cart> carts;
=======
>>>>>>> f31a1b17e1c4881dd592545f46b728202da8f9ed
    private final String id;
    private double balance = 0;

<<<<<<< HEAD

    public User() {
        this.id = UUID.randomUUID().toString();
        this.carts = new ArrayList<>();
=======
    public User() {
        this.id = UUID.randomUUID().toString();
>>>>>>> f31a1b17e1c4881dd592545f46b728202da8f9ed
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
