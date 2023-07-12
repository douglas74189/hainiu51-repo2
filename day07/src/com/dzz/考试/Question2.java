package com.dzz.考试;

import sun.print.SunMinMaxPage;

import java.io.StreamCorruptedException;

public class Question2 {
    public static void main(String[] args) {
        testScore();
    }

    public static void testScore() {
        double[] score = {77.1, 88.1, 76.1, 56.1, 87.1, 98.1, 55.1, 94.1, 39.1, 96.1};
        double max = score[0];
        double min = score[0];
        double sum=0;
        double average = 0;

        for (int i = 0; i < score.length; i++) {
            max=max<score[i]?score[i]:max;
            min=min>score[i]?score[i]:min;
            sum+=score[i];

        }
        average=sum/score.length;
        System.out.println("学生的最高分为"+max+"；最低分为"+min+";平均分为"+average);

    }

}
