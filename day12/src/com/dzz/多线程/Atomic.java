package com.dzz.多线程;

import javax.swing.*;
import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class Atomic {
    private static AtomicInteger num = new AtomicInteger();

    public static void main(String[] args) throws InterruptedException {
        /*for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {

                    for (int j = 0; j < 100; j++) {
//                        num.incrementAndGet();
                        num.incrementAndGet();
                    }

                }
            }).start();

        }

        Thread.sleep(100);
        System.out.println(num);*/

        HashMap<String, String> map = new HashMap<>();
        new Thread(() -> {
            for (int i = 0; i < 50; i++) {
                map.put(Integer.toString(i), Integer.toString(i));

            }
        }).start();
        new Thread(() -> {
            for (int i = 50; i < 101; i++) {
                map.put(Integer.toString(i), Integer.toString(i));

            }
        }).start();
        map.forEach((k, v) -> {
            System.out.println(k + "=" + v);
        });
    }

}
