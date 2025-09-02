package com;

import java.util.Scanner;

public class FuncMeth {
    public static void main(String[] args) {
        int ans = sum2();
        System.out.println(ans);
    }

    // return a value here
    static int sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
}