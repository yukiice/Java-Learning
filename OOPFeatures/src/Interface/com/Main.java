package Interface.com;

import Abstract.com.Person;
import Abstract.com.Student;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Child c1 = new Child("yukiice",18,"man");
        c1.study();
        c1.test();
        Child clone = (Child) c1.clone();

        System.out.println(c1);
        System.out.println(clone);
//        直接调用接口里面的
        Study.test01();
        System.out.println(Study.age);

        c1.helloB();


    }
}
