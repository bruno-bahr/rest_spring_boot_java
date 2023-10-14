package com.br.api.apigateway.controllers;

import com.br.api.apigateway.model.Person;
import com.br.api.apigateway.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService service;

    @GetMapping
    @RequestMapping("/{id}")
    @ResponseBody
    public Person findById(@PathVariable String id){
        return service.findById(id);
    }
}
