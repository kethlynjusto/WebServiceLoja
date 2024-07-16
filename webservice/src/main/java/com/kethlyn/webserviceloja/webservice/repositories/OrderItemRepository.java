package com.kethlyn.webserviceloja.webservice.repositories;

import com.kethlyn.webserviceloja.webservice.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {


}
