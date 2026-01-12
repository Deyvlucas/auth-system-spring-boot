package com.gltec.auth.controller;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gltec.auth.model.User;
import com.gltec.auth.service.UserService;

import lombok.RequiredArgsConstructor;

@RestController // Anotação para indicar que essa classe é um controlador e que ela vai lidar com as requisições HTTP, como POST, GET, etc e retornar respostas em JSON
@RequestMapping("/api/auth") // Prefixo das rotas do controlador, por exemplo, http://localhost:8080/api/auth
@RequiredArgsConstructor


public class AuthController {

    private final UserService userService;

    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody Map<String, String> body) {

        User user = userService.registerUser(
                body.get("name"),
                body.get("email"),
                body.get("password")
        );

        return ResponseEntity.ok(user); // Retorna o usuário cadastrado
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody Map<String, String> body) {

        User user = userService.authenticate(
                body.get("email"),
                body.get("password")
        );

        return ResponseEntity.ok(user);
    }
}
