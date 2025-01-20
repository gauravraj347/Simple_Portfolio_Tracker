package com.Stocks.Simple_Portfolio_Tracker.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Stocks.Simple_Portfolio_Tracker.Model.User;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}