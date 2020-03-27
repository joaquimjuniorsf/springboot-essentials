package br.com.awsome.endpoint;

import br.com.awsome.model.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentEndPoint {

    @RequestMapping(method = RequestMethod.GET,path = "/list")
    public ResponseEntity<List<Student>> listAll(){
        return ResponseEntity.ok().body(Arrays.asList(new Student("Darth Vader"),new Student("Leia Organa")));
    }
}
