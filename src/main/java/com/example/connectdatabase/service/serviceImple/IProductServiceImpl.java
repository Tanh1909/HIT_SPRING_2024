package com.example.connectdatabase.service.serviceImple;

import com.example.connectdatabase.entity.Product;
import com.example.connectdatabase.repository.ProductRepository;
import com.example.connectdatabase.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IProductServiceImpl implements IProductService {
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Product findById(Long id)  {
        return productRepository.findById(id).orElseThrow(() -> new RuntimeException("abc"));
    }

    @Override
    public Product create(Product product) {
        if(productRepository.findByNameProduct(product.getNameProduct()).isPresent()){
            throw new RuntimeException("Name has been taken");
        }
        return productRepository.save(product);
    }

    @Override
    public Product putUpdate(Long id, Product product) {
      Product productOld= productRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy"));
      productOld.setNameProduct(product.getNameProduct());
      productOld.setPrice(product.getPrice());
      productOld.setNameCategory(product.getNameCategory());
      return productRepository.save(productOld);
    }

    @Override
    public Product patchUpdate(Long id, Product product) {
        Product productOld= productRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy"));
        if(product.getNameProduct()!=null){

        }
        return product;
    }

    @Override
    public Product delete(Long id) {
        return null;
    }


}
