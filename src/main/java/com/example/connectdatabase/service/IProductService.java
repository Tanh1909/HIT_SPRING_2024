package com.example.connectdatabase.service;

import com.example.connectdatabase.entity.Product;

import java.util.List;

public interface IProductService {
    List<Product> findAll();
    Product findById(Long id);
    Product create(Product product);
    Product putUpdate(Long id,Product product);
    Product patchUpdate(Long id,Product product);
    Product delete(Long id);
}
