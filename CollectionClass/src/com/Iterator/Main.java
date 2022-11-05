package com.Iterator;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        集合类是支持foreach写法的
        List<String> list =new LinkedList<>(Arrays.asList("1","2","3"));
//        for (String s : list)
//            System.out.println(s);

        System.out.println("------");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        Test test = new Test();
//        for (String i : test)
//            System.out.println(i);


        System.out.println("-------");

//        ListIterator
        iterator.remove();
        System.out.println(list);
        iterator.forEachRemaining(System.out::println);
    }





    static class Test implements Iterable<String>{   //这里我们随便写一个类，让其实现Iterable接口
        @Override
        public Iterator<String> iterator() {
            return new Iterator<String>() {   //生成一个匿名的Iterator对象
                @Override
                public boolean hasNext() {   //这里随便写的，直接返回true，这将会导致无限循环
                    return true;
                }

                @Override
                public String next() {   //每次就直接返回一个字符串吧
                    return "测试";
                }
            };
        }
    }
}
