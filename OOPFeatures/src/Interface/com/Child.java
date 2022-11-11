package Interface.com;
public class Child extends Person implements Study,Cloneable,B{
    public Child(String name,int age,String sex){
        super(name,age,sex);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {   //提升clone方法的访问权限
        return super.clone();   //因为底层是C++实现，我们直接调用父类的实现就可以了
    }

    @Override
    public void  study(){
        System.out.println("这是child里面的study");
    }

    @Override
    public void helloB(){
        System.out.println("子类实现");
    }



}
