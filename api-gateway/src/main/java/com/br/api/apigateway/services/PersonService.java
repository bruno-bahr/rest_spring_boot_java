package com.br.api.apigateway.services;

import com.br.api.apigateway.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonService {

    private final AtomicLong counter = new AtomicLong();
    private final Logger logger = Logger.getLogger(PersonService.class.getName());

    public Person findById(String id){
        logger.info("Finding person...");
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Bruno");
        person.setLastName("Bahr");
        person.setAddress("Rua Lauro Ramos, 32");
        person.setGender("M");
        return person;
    }
}
