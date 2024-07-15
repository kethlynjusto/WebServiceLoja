package com.kethlyn.webserviceloja.webservice.config;

import com.kethlyn.webserviceloja.webservice.entities.User;
import com.kethlyn.webserviceloja.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Maria Browen", "maria@gmail.com", "98989898", "111");
        User u2 = new User(null, "Alex Green", "alex@gmail.com", "9797979797", "222");
        User u3 = new User(null, "Teste", "Teste@gmail.com", "9", "333");

        userRepository.saveAll(Arrays.asList(u1, u2, u3));
    }
}
