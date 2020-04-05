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
    public ResponseEntity<List<Student>> findStudentByName(@RequestParam(value = "name",required = false) String name) {
        return ResponseEntity.ok().body(studentService.findByName(name));
    }

    @PostMapping(path = "/save")
    public ResponseEntity<Student> save(@RequestBody Student student) {
        return ResponseEntity.ok().body(studentService.save(student));
    }

    @PutMapping(path = "/update")
    public ResponseEntity<Void> update(@RequestBody(required = true) Student student) {
        studentService.update(student);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping(path = "/delete/{id}")
    public ResponseEntity<Void> delete(@PathVariable(required = true) Integer id){
        studentService.delete(id);
        return ResponseEntity.ok().build();
    }
}
