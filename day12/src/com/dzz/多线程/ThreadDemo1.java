package com.dzz.多线程;

import java.util.concurrent.*;

public class ThreadDemo1 {

    public static void main(String[] args) {
        /*
        ArrayBlockingQueue<String> aque1=new ArrayBlockingQueue<>(1);
        new Thread(()->{
            System.out.println("线程1");
            int x=0;
            while (true){
                try {
                    aque1.add("产品"+ ++x);
                    System.out.println("生产了"+x+"个产品,剩余产品数： "+aque1.size());
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }
        }).start();
        new Thread(()->{
            System.out.println("线程2");
            String s = null;
            while (true) {
                try {
                    s=aque1.take();
                    System.out.println("消费了1个产品"+s+",剩余产品数： "+aque1.size());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        */
        /*ArrayBlockingQueue que1=new ArrayBlockingQueue(2);
        new Thread(new Productor(que1)).start();
        new Thread(new Consumer(que1)).start();*/
        /*ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.submit(()-> System.out.println("线程任务开始"     ));
        executorService.shutdown();
*/
/*
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.submit(()->{

                System.out.println(Thread.currentThread().getName()+"the mission has done for"+ finalI +"times");
            });

*/
        /*ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executorService.submit(()->{
                System.out.println(Thread.currentThread().getName()+"CashedThread has been done for "+ finalI +"
                times");
            });
        }
*/
        /*
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 4, 10, TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(10), Executors.defaultThreadFactory(), new ThreadPoolExecutor.AbortPolicy());
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            threadPoolExecutor.submit(()-> System.out.println("thread is  "+Thread.currentThread().getName()+"do the "+ finalI +" times"));
        }*/








    }
}

class Productor implements Runnable {
    private ArrayBlockingQueue queue = new ArrayBlockingQueue(1);

    public Productor(ArrayBlockingQueue que) {
        this.queue = que;
    }


    @Override
    public void run() {
        System.out.println("Produce 10 elements|");
        for (int i = 1; i < 11; i++) {
            try {
                queue.put("brand" + i);
                System.out.println("Produce successful,the products left number is:" + queue.size());

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}

class Consumer implements Runnable {
    private ArrayBlockingQueue queue = new ArrayBlockingQueue(2);

    public Consumer(ArrayBlockingQueue que1) {
        this.queue = que1;
    }

    @Override
    public void run() {
        while (true) {
            try {
                queue.take();
                System.out.println("Consume 1,there is still  " + queue.size() + " left");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }
    }
}