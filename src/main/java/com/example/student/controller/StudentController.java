package com.example.student.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.student.model.Student;
import com.example.student.respostry.StudentRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
private StudentRepository studentRepository; 

    @GetMapping
    public List<Student> getAlldata() {
        return studentRepository.findAll();
    }
    

    @PostMapping
    public Student postDataALL(@RequestBody Student student ) {
        return studentRepository.save(student);
    }
    
@DeleteMapping("/{id}")

  public void deleteStudent(@RequestBody Integer id ) {
         studentRepository.deleteById(id);
    }
}