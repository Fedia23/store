package com.program.person.dto;

import com.program.person.entitys.enums.PersonRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Set;

@Getter
@AllArgsConstructor
public class PersonDTO {
    private Long id;
    private int age;
    private String name;
    private String username;
    private String password;
    private String email;
    private Set<PersonRole> roles;
}
