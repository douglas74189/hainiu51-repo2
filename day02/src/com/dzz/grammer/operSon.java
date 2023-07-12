package com.dzz.grammer;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.sql.SQLOutput;

public class operSon<io> extends operator {


    {
        int k=2;
        System.out.println("子类非静态变量"+k);
    }

    {
        System.out.println("子类非静态代码块");
    }

    public operSon() {
        System.out.println("子类构造函数");

    }

    static {
        int i = 3;
        System.out.println("子类静态变量" + i);
    }

    static {
        System.out.println("子类静态代码块");
    }

    public static void main(String[] args) {
        operSon s1;
        System.out.println();
        operSon s2=new operSon();
        double[] d1={1.1,2.3,1.31,1.3};
        double[] d2=null;
        System.out.println(d2);
    }

}
