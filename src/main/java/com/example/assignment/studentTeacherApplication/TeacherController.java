package com.example.assignment.studentTeacherApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("teacher")
public class TeacherController {

    @Autowired
    TeacherService teacherService;

    @PostMapping("/add")
    public ResponseEntity<String> addTeacher(Teacher teacher){
        teacherService.addTeacher(teacher);
        return new ResponseEntity("Teacher added Successfully..!", HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Teacher> getTeacher(@PathVariable ("id") int id){
        return new ResponseEntity(teacherService.getTeacher(id), HttpStatus.FOUND);
    }
}
