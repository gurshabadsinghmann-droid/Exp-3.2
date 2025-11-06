package com.example.experiment;

public class Student {
    private int id;
    private String name;
    private Course course;

    public Student(Course course) {
        this.course = course;
    }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    public void displayInfo() {
        System.out.println("Student ID: " + id + ", Name: " + name);
        course.displayCourse();
    }
}
