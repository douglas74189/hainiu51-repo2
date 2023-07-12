package com.dzz;

public class HelloWorld{
    public static void main(String[] args) {
        if (1==2) {
            System.out.println("123");
            System.out.println();
        }
    }
    private int a;


    protected int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }
}
