package com.example.demo.service;

import com.example.demo.dao.IPersonDao;
import com.example.demo.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class PersonService {
    private final IPersonDao iPersonDao;

    @Autowired
    public PersonService(@Qualifier ("fakeDao") IPersonDao iPersonDao) {
        this.iPersonDao = iPersonDao;
    }

    public int addPerson(Person person){
    return iPersonDao.insertPerson(person);
    }

    public List<Person> getAllPeople(){
        return iPersonDao.selectAllPeople();
    }

    public Optional<Person> getPersonById(UUID id) {
        return iPersonDao.selectPersonById(id);
    }
    public int deletePersonById(UUID id){
        return iPersonDao.deletePersonById(id);
    }

    public int updatePersonById(UUID id, Person person){
        return iPersonDao.updatePersonById(id,person);
    }
}
