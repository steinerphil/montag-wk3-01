package com.example.Repo;

import com.example.Model.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentRepo {

    private final List<Student> students = new ArrayList<>();

    public List<Student> list() {
        return students;
    }

    public Student add(Student student) {
        students.add(student);
        return student;
    }

    public Student getById(int id) {
        for (Student student : students
        ) {
            if (student.getId() == id) {
                return student;
            }
        }
        throw new IllegalArgumentException("student with id not found");
    }

    public List<Student> getByName(String name) {
        List<Student> studentsWithName = new ArrayList<>();
        for (Student student : students) {
//            System.out.println(students.size());
//            System.out.println(".getName(): " + student.getName() + " | .equals(name): " + name);
            if (student.getName().equals(name)) {
                studentsWithName.add(student);
            }
        }
        return studentsWithName;
    }
}