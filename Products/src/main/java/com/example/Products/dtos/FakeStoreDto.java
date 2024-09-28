package com.example.Products.dtos;

import com.example.Products.models.Category;
import com.example.Products.models.Product;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FakeStoreDto {
    private long id;
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;

    public Product toProduct(){
        Product product = new Product();
        product.setId(id);
        product.setPrice(price);
        product.setTitle(title);
        product.setImgUrl(image);
        product.setDescription(description);
        Category category1 = new Category();
        category1.setTitle(category);
        return product;
    }
}
