package Interface.com;

public class Person {
    String name;
    int age;
    String sex;
    public Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public String toString() {
        return "Person{" + "name='" + name + '\'' +
        ", age=" + age  + ", sex='" + sex + '\'' + '}';
    }

    public void helloB(){
        System.out.println("父类实现");
    }
}
