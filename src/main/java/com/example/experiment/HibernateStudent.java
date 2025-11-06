package com.example.experiment;

import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class HibernateStudent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "course")
    private String course;

    public HibernateStudent() {}

    public HibernateStudent(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getCourse() { return course; }
}
