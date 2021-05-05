package com.cn.oops.inheritance;

public interface ImplProvider extends Interf,Interf2 {

    public void run();
    
    public default  void walk() {
        System.out.println("Kavvan");
    }
}
