package com.dzz.interCLass;

public abstract class Family {
    public abstract void familyCall();

    private String homeId;
    private int homeAge;

    public void family() {
        System.out.println("每一个家族成员在关键时刻都会受到大长老的召唤");

    }

    public Family(String homeId, int homeAge) {
        System.out.println("家族构造");
        this.homeId = homeId;
        this.homeAge = homeAge;
    }
}
