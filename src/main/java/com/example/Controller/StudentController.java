package com.example.Controller;

import com.example.Model.Student;
import com.example.Service.StudentService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;



@RestController //macht aus der klasse einen rest controller

@RequestMapping("student") //einstieg in die seite http://localhost:8080/student

public class StudentController {

 StudentService studentService = new StudentService();

    @GetMapping
    public List<Student> list(){
        return studentService.list();
    }

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getStudent(id);
    }

    @PutMapping
    Student addStudent(@RequestBody Student student){
        return studentService.add(student);
    }



}
