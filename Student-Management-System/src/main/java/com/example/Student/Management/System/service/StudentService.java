package com.example.Student.Management.System.service;

import com.example.Student.Management.System.model.Student;
import java.util.List;
public interface StudentService {
    Student saveStudent(Student student);
    List<Student> getAllStudents();
    Student getStudentById(Long id);
    Student updateStudent(Student student, Long id);
    void deleteStudent(Long id);

}
