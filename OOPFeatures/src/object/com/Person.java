package object.com;

public class Person {
    String name;
    int age;
    String sex;
    public  Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    @Override
    public boolean equals(Object obj){
        if (obj == null) return  false;
        if (obj instanceof  Person){
            Person person = (Person) obj;
            return  this.name.equals(person.name) && this.age == person.age && this.sex.equals(person.sex);
        }
        return  false;
    }

    protected void  exam(){
        System.out.println("这是person");
    }
}
