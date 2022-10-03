package object.com;

public class Child extends Person {
    public Child(String name,int age,String sex){
        super(name,age,sex);
    }
    @Override
    public void exam(){
        super.exam();
     System.out.println("这是child");
    }
}
