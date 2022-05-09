package com.company.repository;

import com.company.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductRepository {
    private List<Product> products = new ArrayList<>();

    public void save(Product product){
        this.products.add(product);
        System.out.println("Product added to Database!");
    }

    public void delete(Product product){
        this.products.remove(product);
        System.out.println("Product deleted to Database!");
    }

    public void find(int index){
        System.out.println("We find product: " + this.products.get(index));
    }

    public void find(){
        for (Product product: this.products){
            System.out.println(product);
        }
    }


}
