package com.example.student_reg.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    int id;
    String firstname;
    String lastname;
    String email;
    String gender;
    int age;

}
