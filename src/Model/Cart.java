package Model;

import java.util.ArrayList;
import java.util.HashMap;

public class Cart {
    private HashMap<String, Integer> products;
    double finalPrice;

    public Cart(HashMap<String, Integer> products, double finalPrice) {
        this.products = products;
        this.finalPrice = finalPrice;
    }

    public void addProductToCart(String productId, int num) {
        products.put(productId, num);
    }

}
