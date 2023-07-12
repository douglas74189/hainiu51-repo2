package com.dzz.匿名内部类;

import java.sql.SQLOutput;

public class Inter implements tryinrter{



    public static void main(String[] args) {
        new tryinrter(){

            @Override
            public void tryInter() {
                System.out.println("哈哈哈");
            }
        }.tryInter();
    }

    @Override
    public void tryInter() {
        
    }
}
