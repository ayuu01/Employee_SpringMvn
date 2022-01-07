package com.example.EmployeeManagement.Dao;

import com.example.EmployeeManagement.Entity.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<EmployeeEntity, Integer> {
  public EmployeeEntity findById(int id);

}