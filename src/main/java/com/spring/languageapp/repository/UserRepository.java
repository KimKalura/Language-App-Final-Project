package com.spring.languageapp.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.spring.languageapp.model.User;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByUsername(String username);

}