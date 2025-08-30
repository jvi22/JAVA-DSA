//Write a program to print the first n Fibonacci numbers.
package com;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter first n fibonacci numbers: ");
        Scanner in = new Scanner(System.in);
        int n =  in.nextInt();

        int a = 0;
        int b = 1;
        int count = 0;

        while ( n > count){
            System.out.println(a);
            int temp = a + b;
            a = b;
            b = temp;
            count++;
        }
    }
}
