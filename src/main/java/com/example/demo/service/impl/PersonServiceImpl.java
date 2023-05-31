package com.example.demo.service.impl;

import com.example.demo.dao.PersonMapper;
import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Resource
    private PersonMapper pm;


    @Override
    public List<Person> findAll() {
        return pm.findAll();
    }

    @Override
    public Person get(Integer id) {
        return pm.get(id);
    }

    @Override
    public void insert(Person p) {
        pm.insert(p);
    }

    @Override
    public void update(Person p) {
        pm.update(p);
    }

    @Override
    public void deleteById(Integer id) {
       pm.deleteById(id);
    }
}
