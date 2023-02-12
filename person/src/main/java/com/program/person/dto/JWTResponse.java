package com.program.person.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
public class JWTResponse {
    private String token;
    private Long id;
    private String username;
    private String email;
    private Set<String> roles;
}
