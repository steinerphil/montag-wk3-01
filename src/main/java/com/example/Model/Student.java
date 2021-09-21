package com.example.Model;

public class Student {

    int id;
    int age;
    String name;


    public Student(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
