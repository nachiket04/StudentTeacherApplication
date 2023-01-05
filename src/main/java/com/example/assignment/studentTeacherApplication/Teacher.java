package com.example.assignment.studentTeacherApplication;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private Date dob;
    private String mobNo;
    private String education;
    private int numberOfStudents;

    @OneToMany(cascade = CascadeType.ALL)
    private List<Student> students;
}
