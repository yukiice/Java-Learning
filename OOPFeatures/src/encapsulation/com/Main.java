package encapsulation.com;

public class Main {
    public static void main(String[] args){
//        Person p1 = new Person("yukiice",12,"man");
//        p1.setName("大花");
//        System.out.println(p1.getName());
        Person person = Person.getInstance();
        person.setName("大花");
        System.out.println(person.getName());
    }
}
