package Controller;

import Model.Cart;
import Model.Product;
import Model.User;

import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;

public class UserController {
    HashMap<String, User> users;

    public UserController() {
        this.users = new HashMap<>();
    }

    public User getUserById(String id) {
        return this.users.get(id);
    }

    public void createCart(String userId, String productsTuple, double price) {
//        ArrayList<Product> products = new ArrayList<>();
//        this.getUserById(userId).addToCarts(new Cart(products, price));
    }
}
