public class Logic {
    public static void main(String[] args){
        int a = 10;
        if (a >= 110){
            System.out.println("halo");
        }
        System.out.println("halo02");


//        for循环
        int i = 1;
        for (;i<=3;i++){
            System.out.println("你好啊"+i);
        }
        System.out.println(i);


//        continue关键字  我们可以使用continue关键词来跳过本轮循环  直接开启下一轮
//        跳过指的是  循环体中，无论后面有没有未执行的代码，一律不执行

        for (int b=0;b<=4;b++){
            if (b == 1) continue;
            System.out.println("这是B"+b);
        }

//        break关键词  终止整个循环 本轮循环中无论后续还有没有未执行的代码，都不会执行了，而是直接终结整个循环，跳出到循环外部
        for (int c=0;c<=4;c++){
            if (c == 1) break;
            System.out.println("这是C"+c);
        }

System.out.println("---------------------");
//        continue和break可以更方便的控制循环，但是在多重循环嵌套下，他只对离他最近的循环有效（就近原则）
        int f = 0;
        outer:for (int d=0;d<=4;d++){
            for (int e = 0; e<=4;e++){
                if (e == d) break outer;
                System.out.println("这是E"+e);
                f++;
            }
        }

//        outer: for (int d=0;d<=4;d++){
//            for (int e = 0; e<=4;e++){
//                if (e == d) continue outer;
//                f++;
//            }
//        }
        System.out.println(f);

    }
}
