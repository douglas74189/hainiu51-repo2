package com.dzz.lambda表达式;

import sun.java2d.pipe.SpanIterator;

import javax.management.remote.SubjectDelegationPermission;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class SonPoly extends Polymorphic {
    static String s3 = "子类静态字符串变量";
    public int s = 2;
    public String seee="123";
    static class interClass {
        static public String str = "123";
        private int i1;

        public interClass() {
            System.out.println("成员内部类构造函数");
        }

        public void eat() {
            System.out.println("成员内部类非静态函数" + str + "  " + i1);

        }

        public void drink() {
            System.out.println("调用外部类成员变量：" + s3 + i1);
        }

    }

    private int s2;

    static {
        System.out.println("子类静态代码块");
    }

    {
        System.out.println("子类构造代码块+子类非静态变量 " + super.s);
    }

    SonPoly() {
        System.out.println("子类构造函数");
    }

    @Override
    public void drink() {
        System.out.println("儿子不爱喝啤酒");
    }




    void fun() {
        System.out.println(s3);
    }

    @Override
    public void eat() {
        System.out.println("儿子吃奶，不吃食" + s3);
    }
}