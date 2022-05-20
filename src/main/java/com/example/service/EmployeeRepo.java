package com.example.service;

import com.example.model.Model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EmployeeRepo extends JpaRepository<Model, Integer> {



}
