package com.example.graphql_service;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;

@Service
public class HashingService {
    public MessageDigest md = null;
    @PostConstruct
    public void generateSalt() {
        byte[] salt = new byte[16];
        SecureRandom random = new SecureRandom();
        random.nextBytes(salt);

        try {
            this.md = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        this.md.update(salt);
    }

    public byte[] hash(String password) {
        return md.digest(password.getBytes(StandardCharsets.UTF_8));
    }
}
