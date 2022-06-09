package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class User {
    private final String id;
    private int balance = 0;
    private Cart cart = null;

    public User() {
        this.id = UUID.randomUUID().toString();
    }

    public String getId() {

        return id;
    }

    public int getBalance() {
        return balance;
    }

    public void increaseBalance(int change) {
        this.balance += change;
    }

    public void decreaseBalance(int change) {
        this.balance -= change;
    }

    public Cart getCart() {
        if (cart == null) cart = new Cart();
        return cart;
    }
}
