package org.example.application_gestion_produit_springboot.controller;


import org.example.application_gestion_produit_springboot.model.Product;
import org.example.application_gestion_produit_springboot.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.UUID;

@Controller
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/")
    public String homePage(){
        return "home";
    }
    @GetMapping("/list")
    public String list(Model model){
        List<Product> productList = productService.getAllProducts();
        model.addAttribute("productList", productList);
        return "list";
    }
    @GetMapping("/detail/{productId}")
    public String detail(@PathVariable ("productId") UUID productId, Model model){
        Product product = productService.getProductById(productId);
        model.addAttribute("product", product);
        return "detail";git
    }



}
