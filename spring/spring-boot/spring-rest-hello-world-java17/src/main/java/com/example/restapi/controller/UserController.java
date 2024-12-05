package com.example.restapi.controller;

import com.example.restapi.model.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final List<User> users = new ArrayList<>();

    // Get all users
    @GetMapping
    public List<User> getAllUsers() {
        return users;
    }

    // Get a single user by ID
    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return users.stream()
                .filter(user -> user.id().equals(id))
                .findFirst()
                .orElse(null);
    }

    // Create a new user
    @PostMapping
    public User createUser(@RequestBody User user) {
        users.add(user);
        return user;
    }

    // Update a user (since records are immutable, replace the existing record)
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody User updatedUser) {
        int index = -1;
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).id().equals(id)) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            users.set(index, updatedUser);
            return updatedUser;
        } else {
            return null;
        }
    }

    // Delete a user
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        boolean removed = users.removeIf(user -> user.id().equals(id));
        return removed ? "User deleted." : "User not found.";
    }
}