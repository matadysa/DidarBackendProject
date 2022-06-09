package Controller;

public class AppController {
    private UserController userController;
    private ProductController productController;

    public AppController() {
        this.userController = new UserController();
        this.productController = new ProductController();
    }

    public void decision(){

    }

}
