package com.dzz.API;

import com.sun.corba.se.impl.orbutil.ObjectStreamClass_1_3_1;
import com.sun.xml.internal.ws.server.EndpointAwareTube;
import javafx.scene.AmbientLight;

import javax.print.attribute.HashPrintJobAttributeSet;
import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
/*        String str = "1231312adadsadASASDASDSADAS";

        str = str.toLowerCase();
        System.out.println(str);
        char[] st1 = str.toCharArray();
        int count=0;
        for (int i = 0; i < st1.length; i++) {
            if ('a' <= st1[i] && st1[i] <= 'z') {
                count++;
            }
        }
        System.out.println(count);*/
//        adminLogin();
//        checkKeyNum();
//reverseCheck();
//        exchangeIntString();
        adminLogin();
    }

    public static String getType(Object obj) {
        return obj.getClass().toString();
    }

    public static void exchangeIntString() {
        int i1 = 32321;
        System.out.println(getType(i1));
        String s1 = String.valueOf(i1);
        System.out.println(s1);
        s1 = Integer.toString(i1);


        int i2 = Integer.parseInt(s1);
        System.out.println(getType(i2));
        i2 = Integer.valueOf(s1).intValue();
        System.out.println(getType(i2));


    }

    public static void reverseCheck() {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你认为是回文的文字");
        StringBuilder sc1 = new StringBuilder(sc.nextLine());
        StringBuilder sc2 = new StringBuilder(sc1.toString());
        sc1.reverse();
        if (sc1.equals(sc2)) {
            System.out.println("是回文");
        } else {
            System.out.println("不是回文");
        }


    }

    public static void checkKeyNum() {
        String str = "dwdwdwdasdadAShasduawhdu";
        int sign = 0;
        int count = 0;
        int startIn = 0;
        while (sign != -1) {
            sign = str.indexOf("d", startIn);
            startIn = sign + "d".length();
            count++;

        }
        count--;
        System.out.println("共出现了" + count + "次");
    }

    public static StringBuilder verifyCode() {
        StringBuilder sb1 = new StringBuilder();
        for (char i = 'a'; i < 'z'; i++) {
            sb1.append(i);
        }
        for (char i = 'A'; i < 'Z'; i++) {
            sb1.append(i);
        }
        for (char i = '0'; i <= '9'; i++) {
            sb1.append(i);
        }
        StringBuilder sb2 = new StringBuilder();
        Random r1 = new Random();
        for (int i = 0; i < 4; i++) {
            sb2.append(sb1.charAt(r1.nextInt(sb1.length())));
        }
        return sb2;
    }

    public static void adminLogin() {
        Scanner sc = new Scanner(System.in);
        int ident = 5;

        while (ident != 0) {
            System.out.println("请输入用户名");
            String account = sc.nextLine();
            System.out.println("请输入密码");
            String password = sc.nextLine();


            String randomCode=verifyCode().toString();
            System.out.println("请输入验证码 :"+randomCode);     String sb3=sc.nextLine() ;
            if ((account.compareTo("admin") + password.compareTo("dwdwdwdw") != 0)){
                ident--;
                System.out.println("账号或者密码错误，你还有" + ident + "次机会");
            } else if (sb3.equalsIgnoreCase(randomCode) ){
                System.out.println("账号成功");
                System.out.println("验证码通过");
                break;
            }
            else {
                System.out.println("验证码不通过你还有" + ident + "次机会");
                ident--;
            }

        }


    }

}
