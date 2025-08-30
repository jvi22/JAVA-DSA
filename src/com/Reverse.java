// Reverse a number ( take input from user )

package com;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner in = new Scanner( System.in);
        int n = in.nextInt();

        int rev = 0;

        while ( n!= 0 ){
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }
        System.out.println("Reversed number is: " + rev );
        in.close();
    }
}
