package com.dzz.interCLass;


import com.sun.jnlp.IntegrationServiceNSBImpl;

class GrandsonTest {
    public static void main(String[] args) {
        Family f1=new son("123",123,"1",1);
        Father f2=new Grandson("123",123,"1",1);
        f2.outputBelief("123");
        Father f3=new Father("123",123,"1",1) {
            @Override
            public void eat(int s3) {

            }

            @Override
            public void familyCall() {

            }

            @Override
            public void drink() {

            }

            @Override
            public void eat() {

            }
        };
        f3.outputBelief("123");

    }



}