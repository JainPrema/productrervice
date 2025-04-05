package com.ecommerce.productservice.dtos;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class GetProductDto {
    private String title;
    private double price;
    private String imageUrl;
}
