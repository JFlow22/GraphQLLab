package com.example.graphql_service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
@RequiredArgsConstructor
@Service
public class UserFactory {

    private final HashingService hashingService;
    public User createUser(String username, String password, boolean isAdmin){
        return new User(username, hashingService.hash(password), isAdmin);
    }
}
