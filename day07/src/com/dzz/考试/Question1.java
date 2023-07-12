package com.dzz.考试;

public class Question1 {
    public static void main(String[] args) {
        pathCal(100);
    }

    public static void pathCal(double height) {
        double jumpheight = height;
        double path=0;
        path+=height;
        for (int i = 0; i < 10; i++) {
            jumpheight/=2;
            if (i<9){
                path+=jumpheight*2;
            }
            else if (i==9){
                path+=jumpheight;
            }
        }
        System.out.println("第十次弹跳反弹高度是"+jumpheight+"米");
        System.out.println("在第10次反弹到达最高点时，经过的总路程是"+path+"米");

    }






}
