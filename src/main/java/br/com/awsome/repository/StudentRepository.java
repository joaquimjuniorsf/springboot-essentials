package br.com.awsome.repository;

import br.com.awsome.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {
    List<Student> findByNameIgnoreCaseContaining(String name);
}
