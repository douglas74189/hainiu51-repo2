package com.dzz.Loop;

import java.time.Month;
import java.util.Scanner;

public class Circulation {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        long Month = sc1.nextInt();
        switch ((int) Month) {
            case 1:
            case 2:
            case 3:
                System.out.println("spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("autumn");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("输入错五");


        }


    }
}
