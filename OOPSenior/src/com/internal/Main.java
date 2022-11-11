package com.internal;
import com.internal.test.Test;
public class Main {
    public static void main(String[] args) {
        Test test = new Test();
        Test.Inner inner = test.new Inner();
        inner.test("这是内层内部方法");
        inner.test01();
    }
}
