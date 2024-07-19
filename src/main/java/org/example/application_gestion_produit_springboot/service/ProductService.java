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
                .name("americain")
                .category("food")
                .price(8)
                .build();
        Product product2 = Product.builder()
                .id(UUID.randomUUID())
                .name("créme solaire")
                .category("beauté")
                .price(10)
                .build();
        Product product3 = Product.builder()
                .id(UUID.randomUUID())
                .name("kebab")
                .category("fastfood")
                .price(7)
                .build();
        Product product4 = Product.builder()
                .id(UUID.randomUUID())
                .name("chapeau")
                .category("textile")
                .price(5)
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

    public List<Product> getProductByCategoryOrPrice(String category, int price) {
        return products.values()
                .stream()
                .filter(p -> p.getCategory().equals(category) && p.getPrice() <= price)
                .toList();
    }

}
