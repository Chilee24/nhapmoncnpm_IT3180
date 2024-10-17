package com.hust.seller.security;
import com.hust.seller.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

    public interface UserRepository extends JpaRepository<User, Integer> {
        // Custom query to find User by Email

        Optional<User> findByEmail(String email);
    }

