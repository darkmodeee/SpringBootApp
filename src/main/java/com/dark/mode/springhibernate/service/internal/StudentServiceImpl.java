package com.dark.mode.springhibernate.service.internal;

import com.dark.mode.springhibernate.dao.StudentDAO;
import com.dark.mode.springhibernate.exception.ResourceNotFoundException;
import com.dark.mode.springhibernate.model.Student;
import com.dark.mode.springhibernate.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentDAO repository;

    @Autowired
    public StudentServiceImpl(StudentDAO repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Student> all() {
        return repository.findAll();
    }

    @Override
    public Student save(Student student) {
        return repository.save(student);
    }

    @Override
    public Student update(Student student) throws ResourceNotFoundException {
        return repository.save(student);
    }

    @Override
    public Optional<Student> getStudentById(Integer id) throws ResourceNotFoundException {
        return repository.findById(id);
    }

    @Override
    public Iterable<Student> findByLastName(String name) {
        return repository.findByLastName(name);
    }

    @Override
    public Optional<Student> findTopByEmailLike(String email) throws ResourceNotFoundException {
        return repository.findTopByEmailLike(email);
    }

    @Override
    public void delete(Student student) throws ResourceNotFoundException {
        repository.delete(student);
    }

}
