package com.ecommerce.productservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Persistence;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Batch {
    @Id
    private Long id;
    private String name;
    private Integer strength;

    @ManyToOne
    private Instructor instructor;
}

