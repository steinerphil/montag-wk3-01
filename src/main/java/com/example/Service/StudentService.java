package com.example.Service;

import com.example.Model.Student;
import com.example.Repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

private final StudentRepo studentRepo;


    @Autowired
    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }


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

    public Student delete(String id) {
        return studentRepo.remove(Integer.parseInt(id));
    }

    public void save(String updateStudent, int id) {
       studentRepo.updateName(updateStudent, id);
    }
}


