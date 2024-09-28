package com.example.Products.services;

import com.example.Products.models.Product;

import java.util.List;

public class DatabaseProductService implements ProductService{
    @Override
    public Product getSingleProduct(Long productId) {
        return null;
    }

    @Override
    public List<Product> getProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title, String description, String category, double price, String image) {
        return null;
    }
}
