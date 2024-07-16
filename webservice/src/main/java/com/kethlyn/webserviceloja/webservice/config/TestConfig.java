package com.kethlyn.webserviceloja.webservice.config;

import com.kethlyn.webserviceloja.webservice.entities.*;
import com.kethlyn.webserviceloja.webservice.entities.enums.OrderStatus;
import com.kethlyn.webserviceloja.webservice.repositories.*;
import com.kethlyn.webserviceloja.webservice.services.OrderService;
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

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Override
    public void run(String... args) throws Exception {

        Category c1 = new Category(null, "Fantasy");
        Category c2 = new Category(null, "TV");
        Category c3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of Rings", "Lorwm", 90.5, "");
        Product p2 = new Product(null, "Little Prince", "Abba", 80.5, "");
        Product p3 = new Product(null, "PC Gamer", "Lorwm", 99.5, "");

        categoryRepository.saveAll(Arrays.asList(c1, c2, c3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3));

        p1.getCategories().add(c1);
        p2.getCategories().add(c2);
        p3.getCategories().add(c3);

        User u1 = new User(null, "Maria Browen", "maria@gmail.com", "98989898", "111");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9797979797", "222");
        User u3 = new User(null, "Tese Green", "tese@gmail.com", "9797979797", "222");

        Order o1 = new Order(null, Instant.parse("1970-01-01T00:00:00Z"), OrderStatus.PAID, u2);
        Order o2 = new Order(null, Instant.parse("1991-04-06T01:45:52Z"),OrderStatus.DELIVERED, u2);
        Order o3 = new Order(null, Instant.parse("1991-04-06T01:45:52Z"),OrderStatus.CANCELED, u2);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));

        OrderItem oi1 = new OrderItem(o1, p1, 2, p1.getPrice());
        OrderItem oi2 = new OrderItem(o1, p3, 1, p3.getPrice());
        OrderItem oi3 = new OrderItem(o2, p3, 2, p3.getPrice());
        OrderItem oi4 = new OrderItem(o3, p2, 2, p2.getPrice());
        OrderItem oi5 = new OrderItem(o1, p2, 4, p2.getPrice());

        orderItemRepository.saveAll(Arrays.asList(oi1, oi2, oi3, oi4, oi5));

    }
}
