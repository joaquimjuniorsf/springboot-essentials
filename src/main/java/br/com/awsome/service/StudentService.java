package br.com.awsome.service;


import br.com.awsome.exceptions.ResponseException;
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

    public List<Student> findByName(String name) {
        return name != null ? studentRepository.findByNameIgnoreCaseContaining(name) : studentRepository.findAll();
    }

    public Student save(Student student) {
        return studentRepository.save(student);
    }

    public void isExistsStudent(Integer id) {
        studentRepository.findById(id).orElseThrow(() ->new ResponseException("Student not found " + id));
    }

    public void update(Student student){
        isExistsStudent(student.getId());
        studentRepository.save(student);
    }

    public void delete(Integer id) {
        isExistsStudent(id);
        studentRepository.deleteById(id);
    }
}
