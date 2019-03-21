package com.it.a;

public class B extends AAA{
    static {
        System.out.println("BC");
    }
    B(){
        System.out.println("B");
    }
    void fun2(){
        System.out.println("fun2 in B");
    }
}

