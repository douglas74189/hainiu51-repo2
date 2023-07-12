package com.dzz.homework;


class Coach extends Human{

    public Coach(int age, String name, char gender, double saving, long ID) {
        super(age, name, gender, saving, ID);
    }
    @Override
    public void eat(){
        System.out.println("所有人都必须去教练餐厅吃饭");
    }
}