package object.com;

public class Main {
    public static void main(String[] args){
        Person p1 = new Person("yukiice",18,"man");
        Person p2 = new Person("yukiice",18,"man");
        Person p3 = new Child("yukiice",18,"man");
        p3.exam();
        Child p4 = new Child("yukiice",18,"man");
        p4.exam();
        Person p5 = p4;
        p5.exam();
        System.out.println(p1.equals(p2));
    }
}
