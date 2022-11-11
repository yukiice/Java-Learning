package cn.dealError;

public class MainTwo {
    public static void main(String[] args) {
        try {
            test(1,0);
        }catch (Exception e){   // 因为异常本身也是一个对象，catch实际上就是用一个局部变量来去接收异常
            e.printStackTrace();
        } finally {
            System.out.println("异常最终执行");
        }
        System.out.println("程序正常进行");
    }
    public static  int test(int a,int b) throws Exception{
        if (b == 0 )
            throw  new Exception("除数不能为0");
        return  a / b;
    }
}
