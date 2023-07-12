package com.dzz.Loop;

import com.sun.org.apache.xerces.internal.dom.PSVIAttrNSImpl;

import java.util.Scanner;

public class ceshi3 {
    private static int anInt = 0;


    public static void main(String[] args) {
        int a = 10;
        int identityHashCode = System.identityHashCode(a);
        System.out.println(identityHashCode);

        String s;
        int[] i1 = new int[3];
        System.out.println(i1[0]);
        int[] i2 = {1, 23, 1, 3, 1, 2, 121, 312, 19, 23, 12, 21, 1, 3, 12, 31, 312, 3, 321, 3, 127, 6, 756, 576, 567, 56, 5, 654, 6, 77, 45, 645, 6546, 456456};
        int max = i2[0];
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入要查找的数字");
        int s1 = sc1.nextInt();

        for (int i = 0; i < i2.length; i++) {
            /*            max=max>i2[i]?max : i2[i];*/
            if (s1 == i2[i]) {
                System.out.println("您要查找的数字是" + s1 + ",第一个数字所在位置是" + (i + 1));
                break;


            }
            for (int line = 0; line < i2.length; line++) {

            }
            System.out.println();
        }
        System.out.println(max);

    }
}