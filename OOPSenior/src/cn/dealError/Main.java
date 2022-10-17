package cn.dealError;

public class Main {
    public static void main(String[] args) {
//        try {
//            Object object = null;
//            object.toString();
//        }catch (NullPointerException e){
//            e.printStackTrace();
//        }


        try {
            test(1,0);
        }catch (Throwable e){   // 因为异常本身也是一个对象，catch实际上就是用一个局部变量来去接收异常
            e.printStackTrace();
        }
        System.out.println("程序正常进行");
    }
    public static  int test(int a,int b){
        if (b == 0 )
            throw  new ArithmeticException("除数不能为0");
        return  a / b;
    }
}
