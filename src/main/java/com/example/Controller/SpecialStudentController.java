package com.example.Controller;

import com.example.Model.Student;
import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("special")
public class SpecialStudentController {

    private final StudentService studentService;

    @Autowired
    public SpecialStudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping(path = "{id}")
    public Student getStudent(@PathVariable int id){
        return studentService.getById(id);
    }

    @GetMapping
    public List<Student> searchStudents(@RequestParam Optional<String> search){
        if(search.isPresent()){
            System.out.println(search.get());
            return studentService.search(search.get());
        }
        return studentService.list();
    }

    @PutMapping
    Student addStudent(@RequestBody Student student){
        return studentService.add(student);
    }

    @DeleteMapping("{id}")
    public void deleteStudent(@PathVariable String id){
        studentService.delete(id);
    }

    @PutMapping("{id}")
    public ResponseEntity<String> updateStudent(@RequestBody String name  , @PathVariable("id") int id){
        studentService.save(name, id);
        return ResponseEntity.ok("student name updated");
    }


}
