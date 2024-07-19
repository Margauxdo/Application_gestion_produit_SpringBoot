package org.example.application_gestion_produit_springboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

    @Data
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor
public class Product {

    private UUID id;
    private String name;
    private String description;
    private int price;

}
