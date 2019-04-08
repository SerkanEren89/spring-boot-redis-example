package com.serkaneren.redis.demo.repository;

import com.serkaneren.redis.demo.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
