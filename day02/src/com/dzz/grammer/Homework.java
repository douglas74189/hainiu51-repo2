package com.dzz.grammer;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Homework hw1 = new Homework();
        hw1.question1(177, 165);
        hw1.question2();
        hw1.question3();
        hw1.question4();
        hw1.question5();


        hw1.question6();
        hw1.question7();
        hw1.question8();
        hw1.question9();
        hw1.question10();
        hw1.question11();
        hw1.question12();
        hw1.question13();
        hw1.question14();
        hw1.question15();


    }

    public void question1(double fH, double mH) {
        double sonHeight, daughterHeight, faHeight, moHeight;
        sonHeight = (fH + mH) * 1.08 / 2;
        daughterHeight = (fH * 0.923 + mH) / 2;
        System.out.println("儿子身高是：" + sonHeight + "\n" + "女儿身高是：" + daughterHeight);


    }

    public void question2() {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("请输入一个三位数的正整数");
        int new1 = sc1.nextInt();
        if (new1 > 999 || new1 < 1) {
            System.out.println("输入错误");

        } else {
            System.out.println("各位置数字相加之和为：" + ((new1 / 100) + (new1 - (new1 / 100) * 100) / 10 + new1 % 10));

        }

    }

    public void question3() {
        System.out.println("请输入华氏温度：");
        Scanner sc1 = new Scanner(System.in);
        double degreeShe = sc1.nextDouble();
        System.out.println("对应的摄氏温度为：" + (degreeShe - 32) / 1.8);
        System.out.println("请输入摄氏温度：");
        double degreeHua = sc1.nextDouble();
        System.out.println("对应的华氏温度：" + (degreeShe * 1.8 + 32));

    }

    public void question4() {
        double sale1 = 16 + 8 + 3;
        double sale2 = (24 + 8 + 3) * 0.8;
        double sale3;
        sale3 = sale1 > sale2 ? sale2 : sale1;
        System.out.println("最优惠方式是" + sale3);


    }

    public void question5() {
        System.out.println("请输入您想要的年份：");
        Scanner sc1 = new Scanner(System.in);
        int year = sc1.nextInt();
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("今年是闰年");
        } else {
            System.out.println("今年不是闰年");
        }

    }

    public void question6() {
        System.out.println("请输入您想要存款的本金和存款年数：");
        double capital;
        int year;
        Scanner sc1 = new Scanner(System.in);
        capital = sc1.nextDouble();
        year = sc1.nextInt();


        switch (year) {
            case 1:
                System.out.println("存款到期后本息共：" + capital * (1 + (2.25 * year) / 100));
                break;
            case 2:
                System.out.println("存款到期后本息共：" + capital * (1 + (2.7 * year) / 100));
                break;
            case 3:
                System.out.println("存款到期后本息共：" + capital * (1 + (3.25 * year) / 100));
                break;
            case 4:
                System.out.println("本银行不搞4年贷款");
                break;
            case 5:
                System.out.println("存款到期后本息共：" + capital * (1 + (3.6 * year) / 100));
                break;
        }

    }

    public void question7() {
        System.out.println("请输入电梯等待人数");
        Scanner sc1 = new Scanner(System.in);
        int waitMan = sc1.nextInt();
        System.out.println("还需要" + ((waitMan) / 12 * 4 + 2) + "分钟才能乘电梯到达楼上");
    }

    public void question8() {
        int sum = 0;
        int saving = 10;
        for (int i = 1; i < 53; i++) {
            sum += saving * i;
        }
        System.out.println("52周总储蓄为：" + sum);
        System.out.println((10 + 520) / 2 * 52);
    }

    public void question9() {
        int flag = 0;
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                if (i % j == 0) {
                    flag = 1;
                }

            }
            if (flag == 0) {
                System.out.println(i + "是质数");
            }
            flag = 0;
        }

    }

    public void question10() {
        int mounHeight = 8844430;
        double thick = 0.104;
        double thickSum = thick;
        int count = 0;
        while (thickSum < mounHeight) {
            thickSum = thickSum * 2;
            count++;
        }
        System.out.println("折叠" + count + "次，就可以超过珠穆朗玛峰");
    }

    public void question11() {
        int walnut = 1543;
        int dropNum = 0;
        while (walnut > 0) {
            if (walnut % 2 == 0) {
                walnut -= walnut / 2;
            } else {
                ++dropNum;
                --walnut;
                walnut -= walnut / 2;
            }


        }
        System.out.println("总共丢弃了" + dropNum + "个核桃");
    }

    public void question12() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + "*" + i + "=" + (i * j) + "   ");
            }
            System.out.println();
        }
    }

    public void question13() {
        int hundreds;
        int tens;
        int ones;
        int counts = 0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i != j && i != k) {
                        System.out.print(i * 100 + j * 10 + k * 1 + "   ");
                        counts++;
                    }
                }
            }
            System.out.println();
        }
        System.out.println(counts);

    }

    public void question14() {
        int price = 3;
        int recycle = 1;
        int money = 20;
        int num = 0;
        int numSum = 0;
        while (money > 3) {
            num = money / price;
            money = money - price * num + num * recycle;
            numSum += num;
        }
        System.out.println("能买" + numSum + "瓶");
    }

    public void question15() {
        int capacity = 10;
        int waterCap = 0;
        int input = 1;
        int output = 3;
        int time = 0;
        while (waterCap <= capacity) {
            input += 1;
            output = 3;
            if (input < output) {
                time++;
            } else {
                waterCap = input - output + waterCap;
                time++;
            }
        }
        System.out.println(time + "分钟之后，水桶里能保持灌满水的状态");

    }

}
