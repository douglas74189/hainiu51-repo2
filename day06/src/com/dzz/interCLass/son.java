package com.dzz.interCLass;

public class son extends Father {
    public son(String homeId, int homeAge, String familyClass, int classNum) {
        super(homeId, homeAge, familyClass, classNum);
        System.out.println("教子构造");
    }
    private int classNUm=2;
    private String familyClass="教子";

    @Override
    public void outputBelief(String str) {
        System.out.println("作为No." + classNUm + "的" + familyClass + "的唯一夙愿便是教父的安全");
    }
    @Override
    public void drink() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void eat( int s3) {

    }

    @Override
    public void familyCall() {

    }
}
