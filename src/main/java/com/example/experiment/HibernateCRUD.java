package com.example.experiment;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class HibernateCRUD {
    public static void main(String[] args) {
        HibernateStudent s1 = new HibernateStudent("Abhi Chauhan", "Java + Spring");

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        // Create
        session.save(s1);
        tx.commit();
        System.out.println("Student added!");

        // Read
        HibernateStudent student = session.get(HibernateStudent.class, 1);
        System.out.println("Fetched Student: " + student.getName());

        // Update
        tx = session.beginTransaction();
        student = session.get(HibernateStudent.class, 1);
        student = new HibernateStudent("Abhi Updated", "Spring Boot");
        session.merge(student);
        tx.commit();
        System.out.println("Student updated!");

        // Delete
        tx = session.beginTransaction();
        session.delete(student);
        tx.commit();
        System.out.println("Student deleted!");

        session.close();
    }
}
