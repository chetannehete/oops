package com.cn.oops;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.cn.oops.general.Brakes;
import com.cn.oops.general.Tyre;
import com.cn.oops.general.Vehicle1;
import com.cn.oops.inheritance.A;
import com.cn.oops.inheritance.B;
import com.cn.oops.inheritance.C;
import com.cn.oops.interfaces.Vehicle;
import com.cn.oops.interfaces.Yahama;
import com.cn.oops.seperate.D;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        // Tyre vn = new Brakes();
        // vn.getWheels();
        // vn.getColor();
        // A a = new D();
        // a.getOutput();
        //
        // A a3 = new A();
        //
        // A a1 = new B();
        // a1.getOutput();
        //
        // B b = new C();
        // b.getOutput();
        //
        // A a2 = new C();
        // a2.getOutput();
        //
        // Vehicle vehicle = new Yahama() {
        //
        // @Override
        // public String getColor() {
        // System.out.println("color");
        // return "color";
        // }
        // };
        // vehicle.getTyres();
        // vehicle.getColor();

        String[] names = { "acm", "abc", "sd", "asw" };
        int j=23;
        Predicate<String> stK = s -> derive(j,s);
        for (String t : names) {
            if (stK.test(t)) System.out.println(t);
        }
        List<String> abc = new ArrayList<String>(Arrays.asList("89", "123445", "3412345", "080"));

        List<String> s = abc.stream().filter(sa -> sa.contains("1")).collect(Collectors.toList());

        List<String> sq = abc.stream().map(sa->sa+"a").collect(Collectors.toList());
        Map<String, Object> testmap = new TreeMap<String, Object>();
        testmap.put("a", 23);
        testmap.put("s", "as");
        testmap.put("f", 223);
        testmap.put("t", 2678);
        testmap.put("g", "dasd");
        testmap.put("9", "nhh");

//        testmap.forEach((k, v) -> {
//            System.out.println(k + "" + v);
//        });

        List<String> aa = abc.parallelStream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
        System.out.println(aa);
        System.out.println(abc);
        String ss=  names[0];
        abc.stream().forEach(k -> derive(j,ss));
        
    }
    public static boolean derive(String s) {
        return s.charAt(0) == 'a';
    }
    
    public static boolean derive(int j, String s) {
        return s.charAt(0) == 'a';
    }
}
