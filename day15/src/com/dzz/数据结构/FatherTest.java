package com.dzz.数据结构;

import java.lang.reflect.InvocationTargetException;

public class FatherTest {
private String age="父类非静态字符串";
static String age1="父类静态字符串";
static {
    System.out.println("父类静态代码块");
}
static {
    System.out.println("这是："+age1);
}
static void eat(){
    System.out.println("这是父类静态函数");
}

    public FatherTest() {
        System.out.println("父类构造函数");
    }
    {
        System.out.println("父类构造代码块");
    }

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

    }
}
