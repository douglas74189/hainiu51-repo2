package com.dzz.reflect01;

import com.sun.xml.internal.messaging.saaj.soap.ver1_1.Fault1_1Impl;
import jdk.nashorn.internal.ir.annotations.Ignore;

import java.io.FileInputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author DouZhouZHi
 */
public class ReflectDemo {

    /*static {
        System.out.println("main函数静态代码块");
    }

    static void seap() {
        System.out.println("静态函数");
    }


    public ReflectDemo() {
        System.out.println("reflect构造方法");
    }
    {
        System.out.println("构造代码块");
    }

    static public int age;
    private int age1;

    public static void main(String[] args) {
        ReflectDemo r1=new ReflectDemo();
    }*/
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
//        Class<Student> sClazz = Student.class;
//     Student s1 = new Student();
//        Class<Student> sClazz1 = (Class<Student>) s1.getClass();
        Class<Student> sClazz2 = (Class<Student>) Class.forName("com.dzz.reflect01.Student");

        /*System.out.println(sClazz + " \n " + sClazz1 + "\n" + sClazz2);
        System.out.println(sClazz == sClazz1 && sClazz == sClazz2);*/
        /*
        Constructor<Student>[] constructor = (Constructor<Student>[]) sClazz.getConstructors();
        *//*for (Constructor<Student> studentConstructor : constructor) {
            System.out.println(studentConstructor);
        }
*//*

        Student student = sClazz.getConstructor(String.class,int.class,int.class).newInstance("tam",11,91);

        System.out.println(student );
*/
/*
        Class<Student> aClass = (Class<Student>) Class.forName("com.dzz.reflect01.Student");
        Student stu=aClass.getConstructor(String.class,int.class,int.class).newInstance("tam",12,545);*/
        /*
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field);
        }*/
    /*    Field f1 = aClass.getDeclaredField("name");
        f1.setAccessible(true);
//        System.out.println(f1);
        f1.set(stu,"tbm");
        System.out.println(f1.get(stu));*//*
        stu.setAge(12);
        System.out.println(stu.getAge());*/
        /*Field score = aClass.getDeclaredField("score");
        score.setAccessible(true);
        score.set(stu,120);
        System.out.println("score.get(stu) = " + score.get(stu));
*/

      /*  Class<Student> sclass = Student.class;
        Student s1 = sclass.getConstructor().newInstance();
        Method[] m1 = sclass.getMethods();
       *//* for (Method method : m1) {
            System.out.println(method);
        }*//*

        sclass.getMethod("study").invoke(s1);
*/




    }
}

class Student {
    public Student() {
        System.out.println("无参构造");
    }
    static  {
        System.out.println("构造代码块");
    }
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", score=" + score +
                '}';
    }

    private String name;
    private int age;
    private int score;

    public void study() {
        System.out.println("我爱学习");

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Student(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
        System.out.println("带参构造");
    }

    static {
        System.out.println("学生类加载初始化");
    }
}