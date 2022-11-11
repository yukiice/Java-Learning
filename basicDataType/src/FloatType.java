public class FloatType {
    public static void main(String[] args){
        double a = 1.2,b=23;
        System.out.println(a);
        System.out.println(b);

        float c = 9.9F;   // 后面加入一个大写或者小写的F 来表示这个常量是一个float类型
        double d = c;
        System.out.println(d);

        long e = 1212121212112111L;
        float f = e;
        System.out.println(f);  // float虽然空间没有那么大，但是由于是浮点类型，指数是可以变化的，所以最大的数值表示范围实际是大于long类型的，虽然会丢失精度，但是的确是可以表示这么大的值；

//        隐式类型转换  byte => short(char)  => int  => long  => float => double
    }
}
