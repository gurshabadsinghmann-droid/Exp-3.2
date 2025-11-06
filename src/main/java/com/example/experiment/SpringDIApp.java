package com.example.experiment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDIApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Student student = context.getBean(Student.class);
        student.displayInfo();
        context.close();
    }
}
