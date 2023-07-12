package com.dzz.多态;

public class Animal {
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public String race="动物父类";
    private int age=0;

    private char sex='无';
    public void aniCall(){
        System.out.println("动物呼叫转移");
    }
    public void aniSell(){
        System.out.println("动物呼叫买卖");
    }

    public Animal() {
    }

    public Animal(String race, int age, char sex) {




        this.race = race;
        this.age = age;
        this.sex = sex;
    }
}
