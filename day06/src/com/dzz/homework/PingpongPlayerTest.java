package com.dzz.homework;

import static org.junit.jupiter.api.Assertions.*;

class PingpongPlayerTest {
    public static void main(String[] args) {
        PingpongPlayer p1=new PingpongPlayer(12,"tim",'男',423211,132131);
        p1.eat();
        p1.fun();
        p1.learnEnglish();
        BasketballPlayer b1=new BasketballPlayer(21,"213",'女',1314.31,3231);
        b1.eat();
        b1.train();
        System.out.println(b1.getAge());
    }

}