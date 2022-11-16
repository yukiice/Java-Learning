package com.Test;

import java.util.List;

import com.Test.Student;

public interface TestMapper {
    List<Student> selectStudent();
    List<Student> selectStudentById(int i);

    int addStudent(Student student);

    int  deleteStudent(int i);
}
