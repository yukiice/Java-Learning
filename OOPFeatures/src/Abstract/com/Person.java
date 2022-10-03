package Abstract.com;

public abstract class Person {
    String name;
    int age;
    String sex;
    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public abstract void exam();
}
