package book.manage.mapper;

import book.manage.entity.Book;
import book.manage.entity.Borrow;
import book.manage.entity.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface BookMapper {
    @Insert("insert into student (name,sex,grade) values (#{name}, #{sex}, #{grade})")
    int addStudent(Student student);

    @Insert("insert into book (title, `desc`, price) values (#{title},#{desc},#{price})")
    int addBook(Book book);
    @Insert("insert into  borrow(sid, bid) values(#{sid,#{bid}})")
    int addBorrow(int sid, int bid);

    @Select("select * from book where  title = #{title}")
    Book selectBook(String title);


    @Select("select * from student where name = #{name}")
    Student selectStudent(String name);

//    获得借书列表
    @Results({
            @Result(column = "id",property = "id",id = true),
            @Result(column = "name",property = "student",one = @One(select = "selectStudent")),
            @Result(column = "title",property = "book",one = @One(select = "selectBook"))
    })
    List<Borrow> selectBorrowList();

    @Select("select * from student")
    List<Student> getStudentList();
}
