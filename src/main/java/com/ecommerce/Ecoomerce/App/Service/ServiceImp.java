package com.ecommerce.Ecoomerce.App.Service;

import com.ecommerce.Ecoomerce.App.Repo.Repositry;
import com.ecommerce.Ecoomerce.App.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class ServiceImp {
    @Autowired
    public Repositry repo;
    @Transactional
    public UserDetails saveUser(UserDetails userDetails){
        return repo.save(userDetails);
    }

    @Transactional
    public List<UserDetails> getUser(){
        return repo.findAll();
    }
    @Transactional
    public UserDetails getUserById(Long id){
        return repo.findById(id).orElse(null);
    }
    @Transactional
public void delete(UserDetails userDetails){
         repo.deleteAll();
    System.out.println("Deleted successfully");
}
}