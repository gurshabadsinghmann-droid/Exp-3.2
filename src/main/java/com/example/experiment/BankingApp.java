package com.example.experiment;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BankingApp {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AccountService service = context.getBean(AccountService.class);
        service.transferMoney(1, 2, 1000.0);
        context.close();
    }
}
