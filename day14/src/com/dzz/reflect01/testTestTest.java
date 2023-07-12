package com.dzz.reflect01;

import java.sql.SQLOutput;

import static org.junit.jupiter.api.Assertions.*;

class testTestTest {

    public static void main(String[] args) {
        String str1="timan";
        String str2="123";
        System.out.println(str1.matches("[a-zA-Z]+"));
        System.out.println(str2.matches("[0-9]+"));
        new Thread("线程1"){

        }.start();


    }

}