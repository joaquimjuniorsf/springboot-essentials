package br.com.awsome.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Student {
    @EqualsAndHashCode.Include
    private int id;
    private String name;
    public static List<Student> studentList;

    static {
        studentRepository();
    }

    private static void studentRepository(){
        studentList = Arrays.asList(new Student(1,"Dart Vader"),new Student(2,"Anakin Skywaker"));
    }
}
