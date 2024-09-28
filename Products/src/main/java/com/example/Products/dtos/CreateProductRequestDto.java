package com.example.Products.dtos;

// Dto for each create request if user asks to create a product

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductRequestDto {
    private String title;
    private String description;
    private String category;
    private double price;
    private String image;

}
