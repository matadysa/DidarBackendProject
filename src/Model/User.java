package Model;

import java.util.UUID;

public class User {
    private final String id;
    private double balance = 0;

    public User() {
        this.id = UUID.randomUUID().toString();
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
