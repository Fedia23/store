package com.program.person.mapper;

import com.program.person.dto.PersonDTO;
import com.program.person.entitys.Person;
import com.program.person.entitys.Role;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class PersonMapper {

    public PersonDTO mapToDTO(Person person) {
        if (person == null) {
            return null;
        }
        return new PersonDTO(person.getId(), person.getAge(), person.getName(),
                person.getUsername(), person.getPassword(), person.getEmail(),
                person.getRoles().stream().map(Role::getPersonRole).collect(Collectors.toSet()));
    }

    public Person mapFromDTO(PersonDTO dto) {
        Person person = new Person();
        person.setId(dto.getId());
        person.setAge(dto.getAge());
        person.setName(dto.getName());
        person.setEmail(dto.getEmail());
        person.setPassword(dto.getPassword());
        person.setRoles(dto.getRoles().stream().map(r -> new Role(dto.getId(), r)).collect(Collectors.toSet()));
        return person;
    }
}
