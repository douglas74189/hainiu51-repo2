package com.dzz.Class;


import java.net.SocketImpl;

class Human {
    static {
        System.out.println("人类静态代码块");
    }

    {
        System.out.println("人类非静态·代码块");

    }

    private String manName;
    int age;
    String sex;
    double saving;

    public void eat() {
        System.out.println("每个人都会eat");
    }

    public void eat(int s1) {
        System.out.println("每个人都会eat");
    }

    public void fun() {
        System.out.println("每个人都会玩");
    }

    public String getManName() {
        return manName;
    }

    public void setManName(String manName) {
        this.manName = manName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 200) {
            System.out.println("年龄不带这样的");
        }
        this.age = age;


    }

    public String getSex() {

        return sex;
    }

    public void setSex(String sex) {
        if (sex != "male" || sex != "female") {
            System.out.println("不接受变性人");
        }
        this.sex = sex;

    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    public Human() {
        System.out.println("人类无参构造函数");
    }

    public Human(String manName, int age, String sex, double saving) {
        this.manName = manName;
        this.age = age;
        this.sex = sex;
        this.saving = saving;
        System.out.println("人类有参构造函数");
    }
}