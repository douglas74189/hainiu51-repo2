package com.dzz.homework;


import java.util.Enumeration;

class PingpongPlayer extends Player implements PingPong{

    public PingpongPlayer(int age, String name, char gender, double saving, long ID) {
        super(age, name, gender, saving, ID);
    }
    @Override
    public void eat(){
        System.out.println("作为·国家希望，乒乓运动员每餐都要吃肉");
    }

    @Override
    public void learnEnglish() {
        System.out.println("作为国家引以为豪的队员，每个人都要学英语");
    }
}