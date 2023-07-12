package com.dzz.Class;

import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Detail1_1Impl;

import java.sql.SQLOutput;

public class Douglas extends Human {
    static {
        System.out.println("douglas静态代码块");

    }

    {
        System.out.println("douglas非静态代码块");

    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public Douglas(String manName, int age, String sex, double saving, String hobby) {
        super(manName, age, sex, saving);
        this.hobby = hobby;
    }

    private String hobby;


    public void eat() {
        System.out.println("douglas不一样，他支持超健康的水果和蛋白质");

    }


    public void fun() {
        System.out.println("douglas不一样，他只玩杠铃");
    }

    public Douglas() {
        System.out.println("douglas无参构造函数");
    }

    public Douglas(String manName, int age, String sex, double saving) {
        super(manName, age, sex, saving);
        System.out.println("douglas有参构造函数   ");

    }

    public static void main(String[] args) {
        Human h2 = new Human("Dzz", 13, "男", 39000.5);
        Human h1 = h2;
        Douglas d2 = new Douglas("doug", 32, "男", 3032.1, "piano");
        Douglas d1 = d2;
        System.out.println(h1 + "   " + h2 + "   " + d1 + "   " + d2);
        System.out.println(d1.hobby);
        h1.fun();
        h1.eat();
        d1.fun();
        d1.eat();

    }


}
