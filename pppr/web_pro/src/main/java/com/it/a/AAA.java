package com.it.a;

public class AAA {
    static {
        System.out.println("AC");
    }
    AAA(){
        System.out.println("A");
        fun1();
    }
    void fun1() {
        fun2();
    }
    void fun2(){
        System.out.println("fun2 in A");
    }
}


