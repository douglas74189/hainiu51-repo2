package com.dzz.file;

import sun.management.ThreadInfoCompositeData;
import sun.security.provider.Sun;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo implements Callable<Integer> {


    @Override
    public Integer call() throws Exception {
        Integer sum=0;
        for (int i = 0; i < 100; i++) {
            sum+=i;
            System.out.println(sum);
        }
        return sum;
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableDemo cadmain=new CallableDemo();
        FutureTask ftask1=new FutureTask(cadmain);
        Thread th1=new Thread(ftask1);
        th1.start();
        th1.setName("线程1");
        FutureTask ftask2=new FutureTask(cadmain)   ;
        Thread th2=new Thread(ftask2)   ;
        th2.start();
th2.setName("线程2");

        System.out.println(th1.getName());
        System.out.println(th2.getName());
        System.out.println(ftask1.get());
        System.out.println(ftask2.get());

    }

}


