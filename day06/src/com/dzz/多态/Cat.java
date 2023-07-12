package com.dzz.多态;

public class Cat extends Animal{
    public Cat(String race, int age, char sex) {
        super(race, age, sex);
    }
    private int age=1;
    public String race="猫猫";

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String getRace() {
        return race;
    }

    @Override
    public void setRace(String race) {
        this.race = race;
    }

    public Cat() {
    }

    @Override
    public void aniCall(){
        System.out.println("猫猫呼叫转移");
    }
    public void catSell(){
        System.out.println("猫猫不想买卖");
    }
}
