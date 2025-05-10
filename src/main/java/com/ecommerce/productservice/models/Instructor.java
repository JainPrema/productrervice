package com.ecommerce.productservice.models;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Instructor extends User {
    private Double salary;
    private String skill;
    @OneToMany(fetch = FetchType.EAGER, mappedBy = "instructor", cascade = CascadeType.REMOVE)
    private List<Batch> batch;
}
