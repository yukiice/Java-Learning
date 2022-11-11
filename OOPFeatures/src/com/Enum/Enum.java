package com.Enum;

public enum Enum {
    RUNNING("跑步"),SLEEP("睡觉"),GO("走");

    private  final  String name;
    Enum(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
