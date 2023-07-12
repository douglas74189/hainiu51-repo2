package com.dzz.grammer;

public class operator {

    public operator() {
        System.out.println("父类构造函数");
    }

    {
        System.out.println("父类非静态代码块");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    static {
        System.out.println("父类静态代码块");
    }

    static {
        int i = 10;
        System.out.println("父类静态变量" + i);
    }

    {
        int k = 12;
        System.out.println("父类非静态成员变量" + k);
    }


}
