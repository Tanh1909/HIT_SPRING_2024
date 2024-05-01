package com.example.connectdatabase.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column(name = "nameProduct", unique = true)
    @NotBlank(message = "Không được để trống")
    String nameProduct;

    String nameCategory;
    @Min(value = 0, message = "Giá phải lớn hơn 0")
    Double price;

}
