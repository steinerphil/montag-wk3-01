package com.example.Service;

import com.example.Model.Student;
import com.example.Repo.StudentRepo;
import java.util.List;

public class StudentService {
private StudentRepo studentRepo = new StudentRepo();
    List<Student> students;

    public StudentService(){}

    public StudentService(List<Student> students) {
        this.students = students;
    }

    public Student add(Student student) {
        studentRepo.add(student);
        return student;
    }

    public Student getStudent(int id) {
        return studentRepo.get(id);
    }

    public List<Student> list() {
        return studentRepo.list();
    }
}


