package com.ecommerce.productservice.models;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Instructor extends User {
    private Double salary;
    private String skill;
    @OneToMany(mappedBy = "Instructor", cascade = CascadeType.REMOVE)
    private List<Batch> batch;
}
