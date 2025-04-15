package com.ecommerce.productservice.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
//telling hibernate to create a table for you
@Entity (name="ecomm_user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(name = "email_address", unique = true)
    private String email;
}
