package com.ecommerce.Ecoomerce.App;


import com.ecommerce.Ecoomerce.App.Repo.Repositry;
import com.ecommerce.Ecoomerce.App.Service.ServiceImp;
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
    public Repositry repo;
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

}
