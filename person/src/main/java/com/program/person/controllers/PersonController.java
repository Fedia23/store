package com.program.person.controllers;

import com.program.person.dto.PersonDTO;
import com.program.person.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/current/username")
    @ResponseStatus(code = HttpStatus.OK)
    public String getCurrentUserName() {
        return personService.getCurrentUsername();
    }

    @GetMapping("{id}")
    @ResponseStatus(code = HttpStatus.OK)
    public PersonDTO getById(@PathVariable("id") Long id) {
        return personService.getPersonById(id);
    }

    @GetMapping("getAllPerson")
    public List<PersonDTO> getAllPerson() {
        return personService.getAllPersons();
    }

    @DeleteMapping("{id}")
    public void deletePerson(@PathVariable("id") long id) {
        personService.deletePerson(id);
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @GetMapping("/private/user")
    public PersonDTO getPersonByUsername() {
        return personService.getPersongByUsername(personService.getCurrentUsername());
    }
}
