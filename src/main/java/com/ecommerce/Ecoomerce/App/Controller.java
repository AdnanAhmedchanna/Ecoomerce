package com.ecommerce.Ecoomerce.App;


import com.ecommerce.Ecoomerce.App.Repo.UserRepo;
import com.ecommerce.Ecoomerce.App.Service.ProductService;
import com.ecommerce.Ecoomerce.App.Service.ServiceImp;
import com.ecommerce.Ecoomerce.App.model.Product;
import com.ecommerce.Ecoomerce.App.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    public ServiceImp serviceImp;
    public UserDetails userDetails;
    @Autowired
    public UserRepo repo;
    @Autowired
    public ProductService productService;
    public Product product;
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }



    @PostMapping("/save")
    public UserDetails saveUser(@RequestBody UserDetails userDetails){
        return serviceImp.saveUser(userDetails);
    }

    @GetMapping("/data")
    public List<UserDetails> getUserDetails(){
        return serviceImp.getUser();
    }

    @GetMapping("/data/{id}")
    public UserDetails getUserById(@PathVariable Long id){
        return serviceImp.getUserById(id);
    }

    @DeleteMapping("/delete/{userDetails}")

    public void deleteAllUsers(@PathVariable UserDetails userDetails){
        serviceImp.delete(userDetails);
    }
@PostMapping("/save/product")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveProduct(product);}
        @GetMapping("/get/products")
                public List<Product> getAllProducts(){
            return productService.getAllProducts();
    }
    @DeleteMapping("/delete/{id}")
    public void deleteProduct(@PathVariable Long id){
        productService.deleteProduct(id);
    }

}
