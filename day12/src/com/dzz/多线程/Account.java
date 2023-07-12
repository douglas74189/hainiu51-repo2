package com.dzz.多线程;

import com.sun.corba.se.spi.transport.ReadTimeouts;
import sun.awt.windows.ThemeReader;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Account {
    private volatile int num=100;


    public int showMoney(){
        return num;
    }

    public void put(int x){
        num+=x;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" has saved for "+x+" ,"+num+" left");
    }
    public void get(int x){
        num-=x;
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+" Money Out for "+x+" left for "+num);
        }

    public static void main(String[] args) {
        Account a1=new Account();
        new Thread(()->{
            while (true){
                if (a1.showMoney()<=0){
                    System.out.println("money is none!!!!!!");
                    break;
                }
            }
        }).start();

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        new Thread(()->{
            while (true) {
                a1.get(11);
            }
        }).start();
        new Thread(()->{
            while (true) {
            a1.put(10);
            }
        }).start();



    }





}
