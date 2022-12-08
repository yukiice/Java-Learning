package book.manage;

import book.manage.entity.Book;
import book.manage.entity.Student;
import book.manage.mapper.BookMapper;
import book.manage.sql.SqlUtil;
import lombok.extern.java.Log;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.logging.LogManager;

@Log
public class Main {
    public static void main(String[] args) throws IOException {
        LogManager manager  =LogManager.getLogManager();
        manager.readConfiguration(Resources.getResourceAsStream("logging.properties"));
        try (Scanner scanner = new Scanner(System.in)){
            while (true){
                int input;
                try{
                    input =  scanner.nextInt();
                }catch (Exception e){
                    return;
                }
                scanner.nextLine();
                switch (input){
                    case 1:
                        addStudent(scanner);
                        break;
                    case 2:
                        addBook(scanner);
                        break;
                    case 3:
                        selectBook(scanner);
                        break;
                    case 4:
                        selectStudent(scanner);
                        break;
                    case 5:
                        SqlUtil.doSqlWork(bookMapper -> {
                            System.out.println(bookMapper.getStudentList());
                        });
                        break;
                    default:
                        return;
                }

            }
        }

    }

//    添加学生
    private  static  void  addStudent(Scanner scanner){
        System.out.println("请输入学生名字");
        String name = scanner.nextLine();
        System.out.println("请输入学生性别=》男/女");
        String sex = scanner.nextLine();
        System.out.println("请输入学生的入学年份");
        int grade = Integer.parseInt(scanner.nextLine());
        Student student = new Student(name,sex,grade);
        SqlUtil.doSqlWork(bookMapper -> {
          int i =  bookMapper.addStudent(student);
          if (i > 0){
              System.out.println("学生信息录入成功"); log.info("插入成功"+student);
          } else System.out.println("学生信息录入失败");
        });

    }

//    添加书籍
    private  static  void  addBook(Scanner scanner){
        System.out.println("请输入书名");
        String title = scanner.nextLine();
        System.out.println("请输入简介");
        String desc = scanner.nextLine();
        System.out.println("请输入价格");
        int price = Integer.parseInt(scanner.nextLine());
        Book book = new Book(title,desc,price);
        SqlUtil.doSqlWork(mapper -> {
            int i = mapper.addBook(book);
            if (i>0){
                System.out.println("录入书籍信息成功");
                log.info("插入成功"+book);
            }else {
                System.out.println("录入书籍信息失败");
            }
        });
    }

//    查阅书籍
    private static  void  selectBook(Scanner scanner){
        System.out.println("请输入书籍名称");
        String title = scanner.nextLine();
        SqlUtil.doSqlWork(bookMapper ->{
            Book book = bookMapper.selectBook(title);
            System.out.println(book);
        });
    }
//    查阅学生
private static  void  selectStudent(Scanner scanner){
    System.out.println("请输入学生姓名");
    String name = scanner.nextLine();
    SqlUtil.doSqlWork(bookMapper ->{
        SqlUtil.doSqlWork(mapper ->{
            Student student = mapper.selectStudent(name);
            System.out.println(student);
        });
    });
}
}
