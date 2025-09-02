package com;

public class OverLoading {
    public static void main(String[] args) {
        func(56);
        func("jaanvi");
        func(23, 45);
    }

    static void func(int a){
        System.out.println(a);
    }
    static void func(String c){
        System.out.println(c);
    }
    static void func(int a, int b){
        System.out.println(a);
        System.out.println(b);
    }
}
