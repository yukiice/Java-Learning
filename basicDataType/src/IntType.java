public class IntType {
    public static void main(String[] args){
        int a = 99999999;
        byte b = 10;    //  这里其实发生了隐式类型转换 因为数字默认都是int类型
        long c = 999999999999L;  //   需要将其表示为一个long类型的常量数字 需要在其后面添加大写或者是小写的L
        int d = 1_000_000_000;  // 为了提升辨识度  可以用下划线分割每一位
        System.out.println(d);
        System.out.println(0xBF);
        int e = 2147483647;
        e = e+2;
        System.out.println(e);
    }
}