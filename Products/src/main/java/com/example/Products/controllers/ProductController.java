package com.example.Products.controllers;
import com.example.Products.dtos.CreateProductRequestDto;
import com.example.Products.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.Products.services.ProductService;
import com.example.Products.services.FakeStoreProductService;


@RestController
public class ProductController {

    private ProductService productService;

    @Autowired
    public ProductController(FakeStoreProductService fakeProductService) {
        this.productService = fakeProductService;
    }

    @PostMapping("/products")
    public Product createProduct(@RequestBody CreateProductRequestDto request){
        return this.productService.createProduct(
                request.getTitle(),
                request.getDescription(),
                request.getCategory(),
                request.getPrice(),
                request.getImage()
        );

    }

    @GetMapping("/products/{id}")
    public Product getProductDetails(@PathVariable("id") Long productId){
        return this.productService.getSingleProduct(productId);
    }

    @GetMapping("/products")
    public void getAllProduct(){

    }


    public void updateProducts(){

    }



}
