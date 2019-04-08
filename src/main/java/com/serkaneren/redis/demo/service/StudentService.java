package com.serkaneren.redis.demo.service;

import com.serkaneren.redis.demo.model.Student;

public interface StudentService {

    Student saveStudent(Student student);

    Student getById(Long id);
}
