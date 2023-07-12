package com.dzz.多线程;

import java.util.Map;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.*;

public class ThreadPool {

    public static void main(String[] args) {
        ThreadPoolExecutor pool1=new ThreadPoolExecutor(
                0,
                10,
                10,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
new ThreadPoolExecutor.AbortPolicy()
        );
        for (int i = 0; i < 20; i++) {
            final int k=i;
            pool1.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread().getName()+"线程执行任务"+k);
                }
            });
        }


    }
}
