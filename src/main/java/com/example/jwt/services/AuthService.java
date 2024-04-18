package com.example.jwt.services;

import com.example.jwt.dto.JwtResponse;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
   
public JwtResponse login(String client, String clientSecreString){
    JwtResponse jwt = JwtResponse.builder()
    .tokenType("bearer")
    .accessToken("adasdasdasdasd")
    .issuedAt(System.currentTimeMillis()+"")
    .clientId(client)
    .expiresIn(3600)
    .build();

    return jwt;
    }
}
