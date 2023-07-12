package com.dzz.grammer;

import com.sun.javafx.image.impl.IntArgb;
import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;
import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.util.Random;
import java.util.Scanner;

class Obj {
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);


        System.out.println("请输入第1个同学的身高：");
        int h1 = scan1.nextInt();
        System.out.println("请输入第2个同学的身高：");
        int h2 = scan1.nextInt();
        System.out.println("请输入第3个同学的身高：");
        int h3 = scan1.nextInt();

        int max = h1 > h2 ? h1 : h2;
        max = max > h3 ? max : h3;
        System.out.println("最高的学生身高是" + max);
        Random r1=new Random();

    }







    /*private String str="默认值";

    public String toString() {
        return str;
    }
    public void setStr(String str) {
        this.str = str;
    }
}
public class TestRef{
    public Obj aObj=new Obj();
    public int aInt=0;

    public Obj getAObj() {
        return aObj;
    }
    public int getAInt() {
        return aInt;
    }
    public void changeObj(Obj inObj){
        inObj.setStr("值被改变");
    }
    public void changeInt(int inInt){
        aInt=inInt;
    }

    public static void main(String[] args) {
        TestRef oRef=new TestRef();

        System.out.println("引用类型：");
        System.out.println("调用changeObj()前  "+oRef.aObj);
        oRef.changeObj(oRef.aObj);
        System.out.println("调用changeObj()后  "+oRef.aObj);

        System.out.println("基本类型：");
        System.out.println("调用changeInt()前  "+oRef.aInt );
        oRef.changeInt(1);
        System.out.println("调用changeInt()后  "+oRef.aInt);

        Scanner s1=new Scanner(System.in);
        System.out.println("123"+s1.nextLine());
        String nextLine = s1.nextLine();


    }*/
}





























/*class obj{
    String str = "obj类的默认值";

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
public class finger {

      private obj obj1=new obj();
      private int s1= 0;
    public void changeObj(obj changedObj){
        changedObj.setStr("改变obj参数");
    }
    public void changeInt(int a){
        setS1(a);
    }
    public obj getObj1() {
        return obj1;
    }
    public void setObj1(obj obj1) {
        this.obj1 = obj1;
    }
    public int getS1() {
        return s1;
    }
    public void setS1(int s1) {
        this.s1 = s1;
    }
    public static void main(String[] args) {
        finger f1=new finger();
        System.out.println(f1.s1+"  "+f1.obj1+"  "+f1.getS1()+"  "+f1.getObj1() );
        f1.changeInt(5);
        f1.changeObj(new obj());
        System.out.println(f1.s1+"  "+f1.obj1+"  "+f1.getS1()+"  "+f1.getObj1() );



    }



}*/

