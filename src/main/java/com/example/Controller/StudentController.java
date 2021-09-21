package com.example.Controller;

import com.example.Model.Student;
import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController //macht aus der klasse einen rest controller
@RequestMapping("student") //einstieg in die seite http://localhost:8080/student
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @GetMapping
//    public List<Student> list(){
//        return studentService.list();
//    }

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getById(id);
    }

    @GetMapping
    public List<Student> searchStudents(@RequestParam Optional<String> search) {
        if (search.isPresent()) {
            System.out.println(search.get());
            return studentService.search(search.get());
        }
        return studentService.list();
    }

    @PostMapping
    Student addStudent(@RequestBody Student student) {
        return studentService.add(student);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Student> deleteStudent(@PathVariable String id) {
        ;
        return new ResponseEntity<>(studentService.delete(id), HttpStatus.OK);  //gibt in postman aus
    }

}
