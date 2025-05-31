package com.example.student.respostry;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.student.model.Student;


public interface StudentRepository  extends MongoRepository< Student, Integer  > {

    
} 