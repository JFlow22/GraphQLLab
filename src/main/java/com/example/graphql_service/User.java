package com.example.graphql_service;

public record User(String username, byte[] password, boolean isAdmin) {
}
