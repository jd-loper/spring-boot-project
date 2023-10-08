package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.AUGUST;
import static java.time.Month.FEBRUARY;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student joseph = new Student(
                    "Joseph",
                    "jd.loper@icloud.com",
                    LocalDate.of(1993, AUGUST, 24),
                    30
            );

            Student frank = new Student(
                    "Frank",
                    "frank@gmail.com",
                    LocalDate.of(2004, FEBRUARY, 9),
                    30
            );

            repository.saveAll(List.of(joseph, frank));
        };
    }
}
