package org.example.application_gestion_produit_springboot.service;

import org.example.application_gestion_produit_springboot.model.Product;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {

    private final Map<UUID, Product> products;
    public ProductService() {
        products = new HashMap<>();

        Product product1 = Product.builder()
                .id(UUID.randomUUID())
                .name("Product 1")
                .category("Category1.")
                .build();
        Product product2 = Product.builder()
                .id(UUID.randomUUID())
                .name("Product 2")
                .category("Category 2 is ....")
                .build();
        Product product3 = Product.builder()
                .id(UUID.randomUUID())
                .name("Product 3")
                .category("Category 3 is ....")
                .build();
        Product product4 = Product.builder()
                .id(UUID.randomUUID())
                .name("Product 4")
                .category("Category 4 is ....")
                .build();
        products.put(product1.getId(), product1);
        products.put(product2.getId(), product2);
        products.put(product3.getId(), product3);
        products.put(product4.getId(), product4);
    }

    public List<Product> getAllProducts() {
        return products.values().stream().toList();

    }

    public Product getProductById(UUID id) {
        return products.get(id);
    }

    public Product getProductByCategory(String category) {
        return products.values().stream().filter(p -> p.getCategory().equals(category)).findFirst().orElse(null);
    }
    public Product getProductByPrice(int price){
        return products.values().stream().filter(p -> p.getPrice() == price).findFirst().orElse(null);

    }
}
