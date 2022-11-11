package com.anonymousInternalClass;

import com.anonymousInternalClass.test.Student;
import com.anonymousInternalClass.test.Study;
import com.anonymousInternalClass.test.Test;

public class Main {
    public static void main(String[] args) {
        Test test = new Test() {
            @Override
            public void test() {
                System.out.println(name);
                System.out.println("这是匿名内部类");
            }
        };
        test.test();

        Student student = (int a) -> a;
        System.out.println(student.study(1));

//        方法引用
//        Study study = (a,b) -> Integer.sum(a,b);
//        System.out.println(study.sum(1,2));

//        Study study = Integer::sum;
//        System.out.println(study.sum(10,20));
        Main main  = new Main();
        Study study = main::halo;
        System.out.println(study.study());
    }

    public String halo(){
        return  "hello";
    }
}
