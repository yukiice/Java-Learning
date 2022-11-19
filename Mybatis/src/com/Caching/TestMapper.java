package com.Caching;

import java.util.List;
import java.util.Map;

public interface TestMapper {
    List<Student> selectStudent();
    List<Student> selectStudentById(int i);

    int addStudent(Student student);

    int  deleteStudent(int i);
}
