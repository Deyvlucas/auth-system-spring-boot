package com.gltec.auth.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gltec.auth.dto.LoginRequestDTO;
import com.gltec.auth.dto.RegisterRequestDTO;
import com.gltec.auth.dto.UserResponseDTO;
import com.gltec.auth.service.UserService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController // Anotação para indicar que essa classe é um controlador e que ela vai lidar com as requisições HTTP, como POST, GET, etc e retornar respostas em JSON
@RequestMapping("/api/auth") // Prefixo das rotas do controlador, por exemplo, http://localhost:8080/api/auth
@RequiredArgsConstructor


public class AuthController {

    private final UserService userService;
    // Metodo para cadastrar o usuário
    @PostMapping("/register")
    public ResponseEntity<UserResponseDTO> register(@RequestBody RegisterRequestDTO request) {

        UserResponseDTO response = userService.registerUser(
                request.getName(),
                request.getEmail(),
                request.getPassword()
        );

        return ResponseEntity.ok(response); // Retorna a resposta com o status 200

    }

    // Metodo para autenticar o usuário
    @PostMapping("/login")
    public ResponseEntity<UserResponseDTO> login(
        @Valid @RequestBody LoginRequestDTO dto) {

    return ResponseEntity.ok(
            userService.authenticate(
                    dto.getEmail(),
                    dto.getPassword()
            )
    );
}

}
