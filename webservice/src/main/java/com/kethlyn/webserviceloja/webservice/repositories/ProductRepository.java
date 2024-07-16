package com.kethlyn.webserviceloja.webservice.repositories;

import com.kethlyn.webserviceloja.webservice.entities.Category;
import com.kethlyn.webserviceloja.webservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<Product, Long> {


}
