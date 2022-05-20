package com.example.controller;

import com.example.model.Model;
import com.example.service.Servicey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;



//@RequestMapping(path = "/api")
@RestController
public class Controller {
    @Autowired
    private Servicey empservice;

    @GetMapping("/employees")
    public ResponseEntity<List<Model>> getEmployees() {
        System.out.println("hello get employee");
        try {
            return new ResponseEntity<>(empservice.listAll(), HttpStatus.OK);

        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/employees/{id}")
    public ResponseEntity<Model> get(@PathVariable Integer id) {
        System.out.println("get hello");
        try {

            return new ResponseEntity<>(empservice.get(id), HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }


    }
    @PostMapping(path = "/employees")
    public void add(@RequestBody Model model) {
        System.out.println("add hello");
        empservice.save(model);
    }
    @PutMapping("/employees/{id}")
    public ResponseEntity<Model> update(@RequestBody Model model, @PathVariable Integer id) {
        System.out.println("update hello");
        try {
            Model model1 = empservice.get(id);
            empservice.save(model);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/employees/{id}")
    public void delete(@PathVariable Integer id) {

        empservice.delete(id);
    }






}