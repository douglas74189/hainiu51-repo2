package com.dzz.file;

import java.lang.reflect.Array;
import java.util.*;
import java.util.concurrent.locks.ReentrantLock;

/*public class Ticket implements Runnable {
    private static int ticket = 100;
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
       *//* synchronized (Ticket.class){
            while (true) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(Thread.currentThread().getName() + "正在售出第" + ticket + "张票");
                ticket--;
                System.out.println(",还剩" + ticket + "张票");
            }
        }*//*
        *//*while (true) {
            synchronized (this) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println(Thread.currentThread().getName() + ",现在票还有" + ticket + "张，正在售出第  " + ticket-- + "张");
        }
*//*
        while (true) {
            lock.lock();
            try {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + ",现在票还有" + ticket + "张，正在售出第  " + ticket-- + "张");
            } finally {
                lock.unlock();
            }

        }


    }*/
class TicketWindow2 implements Runnable {
    // 一共100张票
    private static int ticket = 100;

    // 可重入互斥锁（空参构造 默认创建非公平锁）
    private ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        // 不停的售卖
        while (true) {
            // 获取锁
            lock.lock();
            try {
                // 判断票是否卖光
                if (ticket <= 0) {
                    break;
                }
                // 模拟售票程序执行的时间
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "正在售出第 " + ticket-- + "张票");
            } finally {
                // 释放锁
                lock.unlock();
            }
        }
    }


    public static void main(String[] args) {
        new Thread(new TicketWindow2(), "窗口1").start();
        new Thread(new TicketWindow2(), "窗口2").start();
        Collection c1=new ArrayList();
        Collection c2=new LinkedList();
        Collection c3=new HashSet();
        Collection c4=new TreeSet();
        Student[] a1=new Student[10];
        Student s1=new Student();
        a1[1]=s1;
        Map m1= new HashMap();

        final int i1=1;
        c1.add(i1);
        c2.add(i1);
        c3.add(i1);
        c4.add(i1);



    }
}
