package book.manage.sql;

import book.manage.mapper.BookMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.util.function.Consumer;

public class SqlUtil {
    private static SqlSessionFactory factory;

    static {
        try {
            factory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis-config.xml"));
        } catch (IOException E) {
            E.printStackTrace();
        }
    }
    public  static  void  doSqlWork(Consumer<BookMapper> consumer){
        try(SqlSession session = factory.openSession(true)) {
            BookMapper bookMapper =session.getMapper(BookMapper.class);
            consumer.accept(bookMapper);
        }
    }
}
