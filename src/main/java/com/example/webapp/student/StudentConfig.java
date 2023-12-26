package com.example.webapp.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student alex = new Student(
                    "Marko",
                    "marko@gmail.com",
                    LocalDate.of(2002, Month.JANUARY, 1)
            );

            repository.saveAll(
                    List.of(alex)
            );
        };
    }
}