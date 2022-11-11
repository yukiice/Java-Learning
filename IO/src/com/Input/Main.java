package com.Input;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        FileInputStream stream = new FileInputStream("/Users/yukiice/Documents/Github/Java-Learning/IO/src/com/Input/a.txt");
        try (FileInputStream stream1 = new FileInputStream("test.txt")){
//            int i;
//            while ((i = stream1.read()) != -1)
//                System.out.print((char) i);

//            byte
//            byte[] bytes = new byte[3];
//            while (stream1.read(bytes) != -1)
//                System.out.println(new String(bytes));


//           计算还有多少可读
            byte[] bytes1 = new byte[stream1.available()];
            stream1.read(bytes1);
            System.out.println(new String(bytes1));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
