package com.serkaneren.redis.demo.service.impl;

import com.serkaneren.redis.demo.model.Student;
import com.serkaneren.redis.demo.repository.StudentRepository;
import com.serkaneren.redis.demo.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new RuntimeException("not found"));
    }
}
