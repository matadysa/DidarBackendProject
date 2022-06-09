package Model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

public class User {
    private static HashMap<String, User> users = new HashMap<>();
    private final String id;
    private double balance = 0;

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

    public double getBalance() {
        return balance;
    }

    public void increaseBalance(int change) {
        this.balance += change;
    }

    public void decreaseBalance(int change) {
        this.balance -= change;
    }
}
