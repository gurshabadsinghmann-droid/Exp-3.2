package com.example.experiment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Course course() {
        return new Course("Java with Spring");
    }

    @Bean
    public Student student() {
        Student s = new Student(course());
        s.setId(1);
        s.setName("Abhi Chauhan");
        return s;
    }
}
