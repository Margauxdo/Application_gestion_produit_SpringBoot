package org.example.application_gestion_produit_springboot.controller;


import org.example.application_gestion_produit_springboot.model.Product;
import org.example.application_gestion_produit_springboot.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

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


}
