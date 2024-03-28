package com.example.form1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.form1.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
