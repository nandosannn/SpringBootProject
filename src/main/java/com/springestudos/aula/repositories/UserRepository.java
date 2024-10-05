package com.springestudos.aula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springestudos.aula.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
