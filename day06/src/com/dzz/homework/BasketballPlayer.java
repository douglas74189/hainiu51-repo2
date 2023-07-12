package com.dzz.homework;


import java.sql.SQLOutput;

class BasketballPlayer extends Player implements Basket{

    public BasketballPlayer(int age, String name, char gender, double saving, long ID) {
        super(age, name, gender, saving, ID);
    }
    @Override
    public void eat(){
        System.out.println("篮球运动员早中晚必须一袋奶");
    }

    @Override
    public void train() {
        System.out.println("作为国家寄予厚望的后浪行业，篮球运动袁必须加倍训练");
    }
}