package com.dark.mode.springhibernate.service;

import com.dark.mode.springhibernate.model.Student;

import java.util.Optional;

public interface StudentService {

    Iterable<Student> all();

    Student save(Student student);

    Optional<Student> getStudent(Integer id);

    Iterable<Student> findByLastName(String lastName);

    Student findTopByEmailLike(String email);

    void delete(Student student);
}
