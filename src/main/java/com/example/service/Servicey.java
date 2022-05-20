package com.example.service;


import com.example.model.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@org.springframework.stereotype.Service
@Transactional
public class Servicey {

    @Autowired
    private EmployeeRepo repo;
    public List<Model> listAll() {

        return (List<Model>) repo.findAll();
    }

    public void save(Model model) {

        repo.save(model);
    }

    public Model get(Integer id) {

        return repo.findById(id).get();
    }

    public void delete(Integer id) {

        repo.deleteById(id);
    }

}

