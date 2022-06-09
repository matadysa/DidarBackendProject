package Model;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> products;
    double finalPrice;

    public Cart(ArrayList<Product> products, double finalPrice) {
        this.products = products;
        this.finalPrice = finalPrice;
    }
}
