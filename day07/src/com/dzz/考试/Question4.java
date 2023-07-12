package com.dzz.考试;

import java.awt.*;
import java.util.Scanner;

public class Question4 {

    public static void main(String[] args) {
        eatPeach();
    }

    public static void eatPeach() {
        int num = 1;

        for (int i = 0; i < 9; i++) {
            num++;
            num*=2;
            System.out.println("第"+(9-i)+"天没吃之前，共有"+num+"个桃子");

        }
        System.out.println("第一天共摘了"+num+"个桃子");
    }

}
