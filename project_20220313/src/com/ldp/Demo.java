package com.ldp;

import java.io.FileInputStream;
import java.util.ArrayList;

/**
 * 第一次使用idea
 */

public class Demo {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        demoMethod(999);
    }

    public static void demoMethod( int temp) {
        try {
            int i=0;
            ArrayList<Object> demolist = new ArrayList<>();
//            FileInputStream fileInputStream=new FileInputStream("demo.txt");
            System.out.println("temp = " + temp);
             System.out.println("hello world!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
