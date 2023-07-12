package com.dzz.Loop;

import com.sun.xml.internal.ws.api.message.MessageWritable;

import java.util.Random;

public class ceshi1 {
    private int i;
    private double id;

    public int getI() {
        return i;
    }

    public void setI(int i  ) {
        this.i = i;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public ceshi1(int i, double id) {
        this.i = i;
        this.id = id;
    }

    public static void main(String[] args) {
/*        Random r1=new Random();

        r1.nextInt();
        System.out.println(r1.nextInt());*/
      /*  int i = 1;
        System.out.println(i++ + i++  );
        System.out.println("i="+i);
        System.out.println(i++ + ++i)   ;
        System.out.println("i="+i);
        System.out.println(i++ + i++ + i++);
        System.out.println("i="+i);*/
        String s1="abc";
        String s2="abc";
        s2+="wro";
        String s3=new String("abc");
        String s4=new String("abc");

        if (s1==s2){
            System.out.println("s1和s2相同");
        }
        if (s3==s2){
            System.out.println("s3和s2相同");
        }else {
            System.out.println("s3和s2不同");
        }

        if (s3==s4){

            System.out.println("s3和s4相同");
        }
        else {
            System.out.println("s3和s4不同");
        }
        System.out.println(System.identityHashCode(s1));
        System.out.println(System.identityHashCode(s2));
        System.out.println(System.identityHashCode(s3));
        System.out.println(System.identityHashCode(s4));

/*        String s1="123";
        String s2=new String("123");*/
/*        int hello = System.identityHashCode("hello");
        System.out.println(hello);
        hello = System.identityHashCode("hello");
        System.out.println(hello);
        hello = System.identityHashCode(new String("hello"));
        System.out.println(hello);
        hello = System.identityHashCode(new String("hello"));
        System.out.println(hello);*/

    }
}
