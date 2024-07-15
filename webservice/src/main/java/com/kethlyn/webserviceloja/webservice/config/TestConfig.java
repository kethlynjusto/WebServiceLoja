package com.kethlyn.webserviceloja.webservice.config;

import com.kethlyn.webserviceloja.webservice.entities.Order;
import com.kethlyn.webserviceloja.webservice.entities.User;
import com.kethlyn.webserviceloja.webservice.entities.enums.OrderStatus;
import com.kethlyn.webserviceloja.webservice.repositories.UserRepository;
import com.kethlyn.webserviceloja.webservice.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Browen", "maria@gmail.com", "98989898", "111");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9797979797", "222");
        User u3 = new User(null, "Tese Green", "tese@gmail.com", "9797979797", "222");

        Order o1 = new Order(null, Instant.parse("1970-01-01T00:00:00Z"), OrderStatus.PAID, u2);
        Order o2 = new Order(null, Instant.parse("1991-04-06T01:45:52Z"),OrderStatus.DELIVERED, u2);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2));
    }
}
