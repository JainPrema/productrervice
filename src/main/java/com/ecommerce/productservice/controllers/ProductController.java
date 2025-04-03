package com.ecommerce.productservice.controllers;


import com.ecommerce.productservice.models.Product;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping("{id}")
    public String getProductById(@PathVariable("id") Long id) {
        return "here is your product" + id;
    }

    //    @RequestBody Product product -> Converts the received json to a Product java object

    @PostMapping("")
    public String createProduct(@RequestBody Product product) {
        System.out.println(product.getName());
        System.out.println(product.getPrice());
        System.out.println(product.getCategory());
        return "here is your product";
    }
}
