package com.kethlyn.webserviceloja.webservice.repositories;

import com.kethlyn.webserviceloja.webservice.entities.Order;
import com.kethlyn.webserviceloja.webservice.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {


}
