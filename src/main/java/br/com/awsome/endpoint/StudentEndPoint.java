package br.com.awsome.endpoint;

import br.com.awsome.model.Student;
import br.com.awsome.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentEndPoint {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/list")
    public ResponseEntity<List<Student>> getStudentByName(@RequestParam(value = "name") String name) {

        return ResponseEntity.ok().body(studentService.findByName(name));
    }

    @PostMapping(path = "/save")
    public ResponseEntity<Student> setStudent(@RequestBody Student student){
        return ResponseEntity.ok().body(studentService.save(student));
    }
}
