package br.com.awsome.endpoint;

import br.com.awsome.exceptions.ResponseException;
import br.com.awsome.model.Student;
import br.com.awsome.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentEndPoint {

    @Autowired
    private final DateUtil dateUtil;

    public StudentEndPoint(DateUtil dateUtil) {
        this.dateUtil = dateUtil;
    }

    @GetMapping(path = "/list")
    public ResponseEntity<List<Student>> listAll(){

        return ResponseEntity.ok().body(Student.studentList);
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<List<Student>> getStudentById(@PathVariable("id") int id){
        List<Student> students = Student.studentList;

        Student s = new Student();
        s.setId(id);
        int i = Student.studentList.indexOf(s);

        if (i < 0){
            throw new ResponseException("Student not found");
        }

        return ResponseEntity.ok().body(Arrays.asList(Student.studentList.get(i)));
    }
}
