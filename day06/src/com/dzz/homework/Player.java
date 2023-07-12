package com.dzz.homework;


class Player extends Human {

    public Player(int age, String name, char gender, double saving, long ID) {
        super(age, name, gender, saving, ID);
    }
    @Override
    public void eat()   {
        System.out.println("所有运动员都必须去国有餐厅吃营养餐");
    }
    public void fun(){
        System.out.println("运动员玩的东西肯定和比尔不一样");
    }

}