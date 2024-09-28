package com.example.Products.services;
import com.example.Products.models.Product;
import java.util.List;

public interface ProductService {
    Product getSingleProduct(Long productId);
    List<Product> getProducts();
    Product createProduct(String title,
                          String description,
                          String category,
                          double price,
                          String image
                          );
}
