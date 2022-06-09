package Model;

import java.util.ArrayList;

public class Cart {
    private ArrayList<Product> content = new ArrayList<>();

    public void addProductToCart(Product product) {
        content.add(product);
    }

    public ArrayList<Product> getContent() {
        return content;
    }
}
