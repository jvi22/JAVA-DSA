package com;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        System.out.println("Enter upto 3 digit number: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean ans = isArmstrong(n);
        System.out.println(ans);
    }

    static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;

        while (n > 0){
            int rem = n % 10 ;
            sum = sum + ( rem * rem * rem);
            n = n / 10;
        }
        return sum == original;
    }
}
