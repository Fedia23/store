package com.program.person.service;

import com.program.person.dto.PersonDTO;
import com.program.person.entitys.Person;
import com.program.person.mapper.PersonMapper;
import com.program.person.repository.PersonRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.security.Principal;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class PersonService {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonDTO createPerson(Person person) {
        return personMapper.mapToDTO(personRepository.save(person));
    }
    public PersonDTO getPersonById(Long id) {
        return personMapper.mapToDTO(personRepository.getReferenceById(id));
    }

    public List<PersonDTO> getAllPersons() {
        return personRepository.findAll().stream()
                .map(personMapper::mapToDTO)
                .collect(Collectors.toList());
    }

    public boolean existsByUsername(String username) {
        return personRepository.findByUsername(username).isPresent();
    }

    public boolean existsByEmail(String email) {
        return personRepository.findByEmail(email).isPresent();
    }

    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

    public PersonDTO getPersongByUsername(String username) {
        return personMapper.mapToDTO(personRepository.findByUsername(username).orElse(null));
    }

    public String getCurrentUsername() {
        return Optional.ofNullable(SecurityContextHolder.getContext().getAuthentication())
                .map(Principal::getName)
                .orElse("");
    }
}
