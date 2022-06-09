package Controller;

import Model.Product;
import Model.User;

import java.util.ArrayList;
import java.util.HashMap;

public class ProductController {
    HashMap<String, Product> products;

    public ProductController() {
        this.products = new HashMap<>();
    }

    public Product getProductById(String id) {
        return this.products.get(id);
    }
}
