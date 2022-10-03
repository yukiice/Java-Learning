package encapsulation.com;

public class Person {
    private String name;    //现在类的属性只能被自己直接访问
    private int age;
    private String sex;

    private Person() {   //构造方法也要声明为公共，否则对象都构造不了
    }

    public static  Person getInstance(){
        return  new Person();
    }
    public void  setName(String name){
        if (name.contains("小")) return;
        this.name = name;
    }

    public String getName() {
        return name;    //想要知道这个对象的名字，必须通过getName()方法来获取，并且得到的只是名字值，外部无法修改
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }
}