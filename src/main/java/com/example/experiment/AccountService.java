package com.example.experiment;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.hibernate.Session;
import org.hibernate.Transaction;

@Service
public class AccountService {

    @Transactional
    public void transferMoney(int fromId, int toId, double amount) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        try {
            Account from = session.get(Account.class, fromId);
            Account to = session.get(Account.class, toId);

            from.setBalance(from.getBalance() - amount);
            to.setBalance(to.getBalance() + amount);

            session.update(from);
            session.update(to);
            tx.commit();
            System.out.println("Transaction successful!");
        } catch (Exception e) {
            tx.rollback();
            System.out.println("Transaction failed! Rolled back.");
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}
