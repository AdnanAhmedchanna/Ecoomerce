package com.ecommerce.Ecoomerce.App.Repo;
import com.ecommerce.Ecoomerce.App.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Repositry extends JpaRepository<UserDetails, Long> {

}