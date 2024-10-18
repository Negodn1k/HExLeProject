package com.hex.hexleproject.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String name;
    private String surname;
    private LocalDate birthday;
    private String email;
    private int age;
}
