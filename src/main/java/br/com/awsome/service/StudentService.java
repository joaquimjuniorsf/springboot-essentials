package br.com.awsome.service;


import br.com.awsome.model.Student;
import br.com.awsome.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    private StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> findByName(String name){
        return studentRepository.findByNameIgnoreCaseContaining(name);
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }
}
