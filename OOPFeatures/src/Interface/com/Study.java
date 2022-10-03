package Interface.com;

public interface Study {

//    接口不同于类，接口中不允许实现成员变量和成员方法，但是可以存在静态变量和静态方法，在接口中定义的变量只能是public static final
    public static final int age = 10;
    void study();
    default  void  test(){
        System.out.println("我是默认实现");
    }

    public static void test01(){
        System.out.println(age);
    }
}