package com.dzz.sc2;

public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws AgeOutOfHumanRange {
        if (age > 100 || age < 8) {

            throw new AgeOutOfHumanRange("年龄不符合人类规范，请输入8-100岁之间的学生年龄");


        } else {
            this.age = age;
        }
    }

    public Student(String name, int age) throws AgeOutOfHumanRange {
        this.name = name;
        setAge(age);
    }
}
