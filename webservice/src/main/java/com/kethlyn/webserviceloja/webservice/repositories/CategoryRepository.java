package com.kethlyn.webserviceloja.webservice.repositories;

import com.kethlyn.webserviceloja.webservice.entities.Category;
import com.kethlyn.webserviceloja.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {


}
