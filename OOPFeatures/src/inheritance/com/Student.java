package inheritance.com;

public class Student extends  Person {
    String name;
    public Student(String name, int age, String sex) {
        super(name, age, sex);
    }

    public  void  study(){
        System.out.println(super.name);
    }
}
