package com.example.assignment.studentTeacherApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.save(student);
    }

    public Student getStudent(int id){
        return studentRepository.findById(id).get();
    }
}
