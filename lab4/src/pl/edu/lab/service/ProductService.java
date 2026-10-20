package pl.edu.lab.service;
import pl.edu.lab.model.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductService {

    private List<Product> products = new ArrayList<>();

    public void addProduct(Product produkt) {
        products.add(produkt);
    }

    public void seeProducts() {

        for (Product i : products){
            i.showProduct();
        }
    }

    public void priceLimit(float limit){

        for (Product i : products){
            if(i.getCena() <= limit)i.showProduct();
        }
    }


}
