package com.ecommerce.Ecoomerce.App.Service;

import com.ecommerce.Ecoomerce.App.Repo.ProductRepo;
import com.ecommerce.Ecoomerce.App.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepo productRepo;

    private Product product;

    public List<Product> getAllProducts(){
        return productRepo.findAll();
    }
    public Product saveProduct(Product product){
        return productRepo.save(product);
    }
    public List<Product> saveAllProduct(Product product){
        return productRepo.findAll();
    }
    public void deleteProduct(Long id){
        productRepo.deleteById(id);
    }
}
