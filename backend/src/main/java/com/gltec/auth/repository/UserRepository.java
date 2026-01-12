package com.gltec.auth.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gltec.auth.model.User;

// public interface serve para criar um contrato de regra de negócio, ou seja, um contrato de regra de negócio para o repository.

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    boolean existsByEmail(String email);
}