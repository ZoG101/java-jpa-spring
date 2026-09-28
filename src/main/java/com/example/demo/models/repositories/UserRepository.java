package com.example.demo.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.models.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
