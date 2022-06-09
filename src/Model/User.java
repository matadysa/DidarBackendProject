package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class User {
    private static HashMap<String, User> users = new HashMap<>();
    private final String id;
    private int balance = 0;
    private Cart cart = null;

    public static User getUserById(String id) {
        return users.get(id);
    }

    public User() {
        this.id = UUID.randomUUID().toString();
        users.put(this.id, this);
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
