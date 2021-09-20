package com.example.Repo;

import com.example.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    List<Student> students;

    public StudentRepo(){}

    public StudentRepo(List<Student> students) {
        this.students = students;
    }

    public List<Student> list(){
        return students;
    }

    public Student add(Student student){
        students.add(student);
        return student;
    }

    public Student get(int id) {
        return students.get(id);
    }
}
