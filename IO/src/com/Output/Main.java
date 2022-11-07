package com.Output;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        这里加true表示开启追加模式  而不是直接替换
//        try (FileOutputStream stream = new FileOutputStream("test.txt",true)){
//            stream.write("hello".getBytes());
//            stream.flush();
//        }catch (IOException e){
//            e.printStackTrace();
//        }


//        可以利用这来实现拷贝操作
        try(FileInputStream stream = new FileInputStream("item2.zip")) {
            FileOutputStream out = new FileOutputStream("item1.zip");
            byte[] bytes = new byte[1024];
            int tmp;
            while ((tmp = stream.read(bytes)) != -1)
                out.write(bytes,0,tmp);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
