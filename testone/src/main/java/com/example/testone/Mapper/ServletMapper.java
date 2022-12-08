package com.example.testone.Mapper;

import com.example.testone.entity.Student;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ServletMapper {
    @Select("select * from testnow")
    List<Student> getAllStudent();
}
