/**
 * 
 */
package com.cn.oops.seperate;

import com.cn.oops.inheritance.A;

/**
 * @author chetan
 *
 */
public class D extends A {

    public D(){
        System.out.println("Class D");
    }
    
    public String getOutput() {System.out.println("D"); return "D";};
}
