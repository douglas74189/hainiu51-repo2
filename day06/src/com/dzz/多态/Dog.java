package com.dzz.多态;

public class Dog extends Animal{
    public Dog(String race, int age, char sex) {
        super(race, age, sex);
    }
    public String race="狗狗";
    public int age=2;

    @Override
    public String getRace() {
        return race;
    }
    public void dogCall(){
        System.out.println("狗狗不想买卖");
    }
    @Override
    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    public Dog() {
    }

    @Override
    public void aniCall(){
        System.out.println("狗狗呼叫转移");
    }
}
