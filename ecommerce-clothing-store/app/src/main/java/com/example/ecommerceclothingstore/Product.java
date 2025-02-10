package com.example.ecommerceclothingstore;

public class Product {
    private String id;
    private String name;
    private String description;
    private double price;

    public Product() {
        // Default constructor required for calls to DataSnapshot.getValue(Product.class)
    }

    public Product(String id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // Getters and setters
}
