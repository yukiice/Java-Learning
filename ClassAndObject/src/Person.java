public class Person {
    String name = "花花1";
    int age = 22;
    String sex = "母";
    void hello(){
        System.out.println("实现hello方法");
    }

    int add(int a, int b){
        return  a +b;
    }


//    this关键字
    void  setNameOne(String name){
        name = name;
    }

    void  setNameTwo(String name){
        this.name = name;
    }


//    构造方法
    public  Person(String name,int age,String sex){
        this.name = name;
        this.age = age;
        this.sex =sex;
    }


//    重载构造方法
//    Person(){
//
//    }



}
