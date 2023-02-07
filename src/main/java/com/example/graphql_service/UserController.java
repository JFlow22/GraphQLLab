package com.example.graphql_service;

import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@RequiredArgsConstructor
@Controller
public class UserController {

    private final UserFactory userFactory;
    @QueryMapping
    public User userByUsername(@Argument String username) {
        return userByUsername(username);
    }

    public List<User> getAllUsers()
    {
        //TODO: getUserList - repository

        return null;
    }
    public boolean isAuthenticated(String username, String password) {
        return true;
    }
}
