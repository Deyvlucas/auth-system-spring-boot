package com.gltec.auth.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// Esses JPA annotations ajudam a mapear as entidades para o banco de dados, criando as tabelas e colunas corretamente.
@Entity // indica que essa classe representa uma tabela no banco de dados
@Table(name = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

// (constraint) e uma regra definida, que garante a integridade, unicidade e exclusividade dos dados
// @Column: É aqui que você define as "leis" do seu banco de dados

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false)
    @JsonIgnore // Quando eu esquecer de usar algum DTO, o spring nunca envia o password para o frontend!
    private String password;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt; //
}
