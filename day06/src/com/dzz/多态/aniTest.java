package com.dzz.多态;

import static org.junit.jupiter.api.Assertions.*;

class aniTest {
    public static void main(String[] args) {
        Animal a1=new Cat();
        Animal a2=new Dog();
 /*       System.out.println(a1.getRace());
        a1.aniCall();
        a2.aniCall();
        System.out.println(a2.race);
        System.out.println(a1.race);*/
/*    a1.aniCall();
    a1.aniSell();
    a2.aniSell();
    a2.aniCall();
    Cat c1=(Cat) a1;
    c1.catSell();*/
    if (a1 instanceof Animal){
        System.out.println("a1是动物引用");
    }
else if (a2 instanceof Cat){
    a1.aniSell();
        System.out.println("a1是猫猫");
    }
else  if (a2 instanceof Dog){
    a1.aniSell();
        System.out.println("a1是狗狗");
    }

    }
}