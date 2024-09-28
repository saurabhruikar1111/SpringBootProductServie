package com.example.Products.services;

import com.example.Products.dtos.FakeStoreDto;
import com.example.Products.models.Product;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeStoreProductService implements ProductService{
    private RestTemplate restTemplate;

    public FakeStoreProductService(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public Product getSingleProduct(Long productId) {
        String url = "https://fakestoreapi.com/products/"+productId;

        FakeStoreDto fakeStoreProduct = restTemplate.getForObject(
                url,
                FakeStoreDto.class
        );
        return fakeStoreProduct.toProduct();
    }

    @Override
    public List<Product> getProducts() {
        return List.of();
    }

    @Override
    public Product createProduct(String title,
                                 String description,
                                 String category,
                                 double price,
                                 String image) {

        FakeStoreDto fakeStoreDto = new FakeStoreDto();
        fakeStoreDto.setTitle(title);
        fakeStoreDto.setPrice(price);
        fakeStoreDto.setDescription(description);
        fakeStoreDto.setCategory(category);
        fakeStoreDto.setImage(image);

        String url = "https://fakestoreapi.com/products/";

        FakeStoreDto response = restTemplate.postForObject(
               url,
               fakeStoreDto,
               FakeStoreDto.class
        );
        return response.toProduct();
    }

}
