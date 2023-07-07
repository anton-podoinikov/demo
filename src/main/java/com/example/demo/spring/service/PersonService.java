package com.example.demo.spring.service;

import com.example.demo.spring.dto.Result;
import com.example.demo.spring.model.Person;

public interface PersonService {
    int save(Person person);
    Result getbyId(int id);
}
