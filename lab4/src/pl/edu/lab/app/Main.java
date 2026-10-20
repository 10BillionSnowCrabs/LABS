package pl.edu.lab.app;
import pl.edu.lab.model.Product;
import pl.edu.lab.service.ProductService;

public class Main {
    public static void main(String[] args)
    {

        ProductService grocery = new ProductService();
        grocery.addProduct(new Product("Ginger", 25));
        grocery.addProduct(new Product("Stick", 15));
        grocery.addProduct(new Product("Carrot", 1000));
        grocery.addProduct(new Product("1/2 of an atom", 0.5F));

        grocery.seeProducts();


    }

}
