package ru.pps.statistics;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        try {
            Class.forName("org.postgresql.Driver");
            //on classpath
        } catch(ClassNotFoundException e) {
            System.out.println("FUCCKKK");
        }
        SpringApplication.run(Application.class, args);
    }
}