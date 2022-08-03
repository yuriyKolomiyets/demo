package com.example.demo.service;

import com.example.demo.dao.IPersonDao;
import com.example.demo.model.Person;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final IPersonDao iPersonDao;

    public PersonService(IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    public int addPerson(Person person){
    return iPersonDao.insertPerson(person);
    }
}
