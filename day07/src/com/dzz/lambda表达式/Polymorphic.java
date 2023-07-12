package com.dzz.lambda表达式;

public abstract class Polymorphic {
    public int s = 3;
    public Object seee;
    private String str="父类非静态字符串";
    {
        System.out.println("父类非静态代码块+非静态变量成员："+s);
    }
    static {
        System.out.println("父类" + "静态代码块");
    }
    Polymorphic(){
        System.out.println("父类构造函数");
    }
    public static int s1=3;
    public abstract void drink();
    public void getMom(){
        System.out.println("追不到mom就没有我");
    }
    public abstract void eat() ;

}
