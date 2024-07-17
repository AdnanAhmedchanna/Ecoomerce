package com.ecommerce.Ecoomerce.App.Repo;

import com.ecommerce.Ecoomerce.App.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product, Long> {

}
