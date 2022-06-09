package Controller;

import Model.User;

public class AppController {
    private UserController userController;
    private ProductController productController;

    public AppController() {
        this.userController = new UserController();
        this.productController = new ProductController();
    }

    public void bought(String userId, String productsTuple, double price) {
        userController.createCart(userId, productsTuple, price);
    }
}