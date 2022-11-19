package com.Caching;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Student {
    public  Student(){
        System.out.println("init");
    }
    int id;
    String name;
    int age;
}
