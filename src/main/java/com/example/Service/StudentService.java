package com.example.Service;

import com.example.Model.Student;
import com.example.Repo.StudentRepo;
import java.util.List;

public class StudentService {

private StudentRepo studentRepo = new StudentRepo();


    public Student add(Student student) {
        return studentRepo.add(student);
    }

    public Student getById(int id) {
        return studentRepo.getById(id);
    }

    public List<Student> list() {
        return studentRepo.list();
    }

    public List<Student> search(String name) {
        return studentRepo.getByName(name);
    }

    public void delete(String id) {
        studentRepo.remove(Integer.parseInt(id));
    }
}


