package com.dzz.数据结构;

import java.io.*;
import java.nio.file.FileAlreadyExistsException;
import java.util.TreeSet;

public class SonTest  implements Serializable {
    private String age = "";
    private static final long serialVersionUID=123;

    static String age1 = "";
    private int agee;
    private  String name;

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public static String getAge1() {
        return age1;
    }

    public static void setAge1(String age1) {
        SonTest.age1 = age1;
    }

    public int getAgee() {
        return agee;
    }

    public void setAgee(int agee) {
        this.agee = agee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public SonTest(int agee, String name) {
        this.agee = agee;
        this.name = name;
    }





    public SonTest() {
        System.out.println("子类构造函数");
    }



    public static void main(String[] args) throws IOException, ClassNotFoundException {
        SonTest s1=new SonTest(23,"都注资后");
        ObjectOutputStream oos=null;
        ObjectInputStream ooi=null;
         oos= new ObjectOutputStream(new FileOutputStream("hellp"));
         oos.writeObject(s1);
         oos.close();

         ooi=new ObjectInputStream(new FileInputStream("hellp"));
         SonTest t2;
         t2= (SonTest) ooi.readObject();
        System.out.println(t2.getAge()+"  "+t2.getAgee()+"  "+t2.getName());
        ooi.close();


        TreeSet

    }

}
