package com.Notes;

import org.apache.ibatis.annotations.*;

import java.util.List;

public interface NotesMapper {
    @Insert("insert into  testnow(name,age) values(#{name}, #{age})")
    int addStudent(Student student);

    @Results({
                    @Result(column ="id",property = "id"),
                    @Result(column = "name",property = "name"),
                    @Result(column = "age",property = "id")
    })
    @Select("select * from testnow limit 2")
    List<Student> getStudent();

    @Results({
            @Result(column = "id",property = "pid"),
            @Result(column = "title",property = "title"),
            @Result(column = "id",property = "brandList",many = @Many(select = "getBrand"))
    })
    @Select("SELECT * FROM products pd LEFT JOIN brand b ON pd.brand_id = b.id limit 2")
    List<Student> getProduct();

    @Select("select * from brand")
    List<Brand> getBrand();


    @Results({
            @Result(id = true, column = "id",property = "id"),
            @Result(column = "title",property = "title"),
            @Result(column = "id",property = "brands",one = @One(select = "getBrandById"))
    })
    @Select("select * from products p where p.brand_id = #{id}")
    Student getStuById(int id);

    @Select("select * from brand b inner join  products pd on b.id = pd.brand_id where b.id = #{id}")
    Brand getBrandById(int id);


//    构造


    @ConstructorArgs({
            @Arg(column = "id",javaType = int.class),
            @Arg(column = "brand",javaType = String.class)
    })
    @Select("select * from products limit 1")
    List<Student> getListTwo();


    @Select("select * from products where brand = #{brand} and price < #{price}")
    List<Student> selectListTwo(@Param("brand") String brand, @Param("price") int price);

}
