package com.cn.oops.interfaces;

public abstract class Yahama implements Vehicle{

    @Override
    public String getTyres() {
        System.out.println("Tyre");
        return "Tyre";
    }

}
