package com.example.connectdatabase.controller;

import com.example.connectdatabase.entity.Product;
import com.example.connectdatabase.service.IProductService;
import com.example.connectdatabase.utils.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;
    @GetMapping("")
    public ResponseEntity<?> findAll(){
        return ResponseEntity.status(HttpStatus.OK).body(Response.Success("Find All",productService.findAll()));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id)  {
        return ResponseEntity.ok(productService.findById(id));
    }
    @PostMapping("")
    public ResponseEntity<?> create(@RequestBody @Valid Product product){
        productService.create(product);
        return ResponseEntity.ok("thanh cong");
//        return ResponseEntity.status(HttpStatus.CREATED).body(Response.Success("Create Success",productService.create(product)));
    }
    @PutMapping("/{id}")
    public ResponseEntity<?> putUpdate(@PathVariable Long id,@RequestBody @Valid Product product)  {
        return ResponseEntity.ok(productService.putUpdate(id,product));
    }

}
