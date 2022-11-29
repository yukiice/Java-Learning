package org.example.mapper;

import org.apache.ibatis.annotations.Select;
import org.example.Student;

public interface TestMapper {
    @Select("select  * from  testnow where id = #{id}")
    public Student getStudentById(int id);
}
