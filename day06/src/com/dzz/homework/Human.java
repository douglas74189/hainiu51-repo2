package com.dzz.homework;

public abstract class Human {
    private int age;
    private String name;
    private char gender;
    private double saving;
    private long ID;

    public void eat() {
        System.out.println("是个人就要摄入点什么");
    }
    public void sleep(){
        System.out.println("是个人就要睡觉" );
    }
    public void work(){
        System.out.println("是个人就要上班");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getSaving() {
        return saving;
    }

    public void setSaving(double saving) {
        this.saving = saving;
    }

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public Human(int age, String name, char gender, double saving, long ID) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.saving = saving;
        this.ID = ID;
    }
}
