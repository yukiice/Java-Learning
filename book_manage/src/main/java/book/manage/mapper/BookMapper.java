package book.manage.mapper;

import book.manage.entity.Book;
import book.manage.entity.Student;
import org.apache.ibatis.annotations.Insert;

public interface BookMapper {
    @Insert("insert into student (name,sex,grade) values (#{name}, #{sex}, #{grade})")
    int addStudent(Student student);

    @Insert("insert into book (title, `desc`, price) values (#{title},#{desc},#{price})")
    int addBook(Book book);

}
