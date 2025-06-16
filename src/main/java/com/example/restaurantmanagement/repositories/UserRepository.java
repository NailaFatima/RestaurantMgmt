package com.example.restaurantmanagement.repositories;

import com.example.restaurantmanagement.models.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(long id);

    User save(User user);
}
