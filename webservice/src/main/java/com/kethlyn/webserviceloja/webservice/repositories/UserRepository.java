package com.kethlyn.webserviceloja.webservice.repositories;

import com.kethlyn.webserviceloja.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {


}
