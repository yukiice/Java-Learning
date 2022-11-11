public class Bitwise {
    public static void main (String[] args){
        int a = 9, b =3; // 1001   0011     则为  0001
        int c = a & b;   // &运算符  两个数任何一位进行比较  都是1则为1  否则为0
        System.out.println(c);

        int d = a | b;   //  1011  11  //  | 运算符  两个数任何一位进行比较  其中一个为1  则为1
        System.out.println(d);


        int e  = a ^ b;  //  1010 10   //  ^运算符   两个数任何一位进行比较  两边都不同的情况下为1，否则为0
        System.out.println(e);
    }
}
