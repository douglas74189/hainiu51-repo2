package com.dzz.file;

public class MyThread1  extends Thread{
    @Override
    public void run  () {
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName()+"="+i);
        }

    }

}
class MyRunnable implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(this.toString()+" 是 "+i);
        }
    }


    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println(this.toString()+"   "+i);
                }
            }
        };
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r1);
        t1.start();
        t2.start();

    }
}
class ThreadTest{
    public static void main(String[] args) {
        /*MyThread1 thread1 =new MyThread1();

        MyThread1 thread2=new MyThread1();
        thread1.start();
        thread2.start();*/


    }
}
