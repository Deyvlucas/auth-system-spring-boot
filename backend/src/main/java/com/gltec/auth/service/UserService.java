package com.gltec.auth.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.gltec.auth.model.User;
import com.gltec.auth.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service // indica que essa classe contem uma logica de negócio ou regra de negócio.
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    // Metodo para cadastrar o usuário
    public User registerUser(String name, String email, String password) {

        if (userRepository.existsByEmail(email)) {
            throw new RuntimeException("Email already registered");
        }

        User user = User.builder() // construtor
                .name(name)
                .email(email)
                .password(password)
                .createdAt(LocalDateTime.now())
                .build();

        return userRepository.save(user);
    }

    // Metodo para autenticar o usuário
    public User authenticate(String email, String password) {

        User user = userRepository.findByEmail(email)
                .orElseThrow(() -> new RuntimeException("User not found"));

        if (!user.getPassword().equals(password)) {
            throw new RuntimeException("Invalid password");
        }

        return user;
    }
}
