package com.stringInput;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(judge());
    }
    public static boolean judge(){
        Scanner scanner = new Scanner(System.in);
        String name =  scanner.nextLine();
        char[] chars = name.toCharArray();
        int i = 0;
        while (i < chars.length / 2){
            if (chars[i] != chars[chars.length - i - 1])
                return false;
            i++;
        }
        return true;
    }
}
