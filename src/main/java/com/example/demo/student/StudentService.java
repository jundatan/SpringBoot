package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        21,
                        LocalDate.of(2000, Month.JANUARY, 5),
                        "mariam@gmail.com"
                )
        );
    }
}
