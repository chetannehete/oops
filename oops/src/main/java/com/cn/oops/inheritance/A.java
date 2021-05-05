/**
 * 
 */
package com.cn.oops.inheritance;

import java.util.function.Consumer;

/**
 * @author chetan
 *
 */
public class A {

    String classAMember;
    public A(){
        System.out.println("Class A");
    }
    
    public <T> Consumer<T> processStart(T t){
        return (Consumer<T>) t;
    }
    
    public String getOutput() {System.out.println("A"); return "A";};
    
}
