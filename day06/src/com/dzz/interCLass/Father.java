package com.dzz.interCLass;

/**
 * @author DouZhouZHi
 */
public abstract class Father extends Family implements eat, drink {

    private String familyClass = "教父";
    private int classNum = 1;

    public void outputBelief(String str) {
        System.out.println("作为No." + classNum + "的" + familyClass + "的唯一夙愿便是家族");
    }

    public String getFamilyClass() {
        return familyClass;
    }

    public void setFamilyClass(String familyClass) {
        this.familyClass = familyClass;
    }

    public int getClassNum() {
        return classNum;
    }

    public void setClassNum(int classNum) {
        this.classNum = classNum;
    }

    public Father(String homeId, int homeAge, String familyClass, int classNum) {
        super(homeId, homeAge);
        this.familyClass = familyClass;
        this.classNum = classNum;
        System.out.println("教父构造");
    }

    public abstract void eat(int s3);
}
