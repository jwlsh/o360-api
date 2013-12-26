package com.eaisys.o360.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.eaisys.o360.api.domain.Person;

@RestController
public class PersonController {

	@Autowired
	PersonService personService;
	
	@RequestMapping(value = "/api/person/{id}",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody Person get(@PathVariable("id") Long id) {
		
		Person p = personService.getPerson(id);

        return p;
    }
}