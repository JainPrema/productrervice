package com.ecommerce.productservice.service;

import com.ecommerce.productservice.models.User;
import com.ecommerce.productservice.repository.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public User createUser(String name,String email){
        User user = new User();
        user.setName(name);
        user.setEmail(email);
        return userRepository.save(user);

    }

    public User getUserByName(String Name){
        return userRepository.findByName(Name).get();
    }
}
