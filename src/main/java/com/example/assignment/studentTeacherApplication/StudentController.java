package com.example.assignment.studentTeacherApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/add")
    public ResponseEntity<String> addStudent(@RequestBody () Student student){
        studentService.addStudent(student);
        return new ResponseEntity("Student added Successfully..!", HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudent(@PathVariable ("id") int id){
        return new ResponseEntity(studentService.getStudent(id), HttpStatus.FOUND);
    }

}
