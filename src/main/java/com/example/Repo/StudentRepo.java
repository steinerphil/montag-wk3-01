package com.example.Repo;

import com.example.Model.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
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
            if (student.getName().equalsIgnoreCase(name)) {
                studentsWithName.add(student);
            }
        }
        return studentsWithName;
    }

    public void remove(int id) {
        Student student = getById(id);
        students.remove(student);
    }

    public void updateName(String name, int id){
        getById(id).setName(name);
    }

}