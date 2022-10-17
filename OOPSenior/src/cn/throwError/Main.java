package cn.throwError;

public class Main {
    public static void main(String[] args) throws Exception {
        test(1,0);
    }
    public  static  int test(int a,int b) throws Exception{

        if (b == 0){
            throw  new Exception("除数不能为0");
        }
        return  a/b;
    }
}
