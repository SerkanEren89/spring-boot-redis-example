package com.serkaneren.redis.demo.runner;

import com.serkaneren.redis.demo.model.Student;
import com.serkaneren.redis.demo.service.StudentService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabasePopulator implements CommandLineRunner {

    private final StudentService studentService;

    public DatabasePopulator(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void run(String... args) {
        for (int i = 0; i< 10000; i++) {
            Student student = new Student();
            student.setFirstName("first:" + i);
            student.setLastName("lasr:" + i);
            student.setId((long) i);
            studentService.saveStudent(student);
        }

        Student student = studentService.getById(1L);
        System.out.println(student.toString());
    }
}
