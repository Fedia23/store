package com.program.person.dto;

import com.program.person.entitys.Role;
import lombok.Getter;

import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class SingUpRequest extends PersonDTO {

    public SingUpRequest(Long id, int age, String name, String username, String password, String email, Set<Role> roles) {
        super(id, age, name, username, password, email, roles.stream().map(Role::getPersonRole).collect(Collectors.toSet()));
    }
}
