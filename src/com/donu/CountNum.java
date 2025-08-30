//check no. of
package com.donu;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        System.out.println("Count all no. 3: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int count = 0;
        int temp = num;

        while ( temp > 0 ){
            int n = temp % 10 ;

            if ( n == 3 ){
                count++;
            }
            temp /= 10;
        }
        System.out.println("number of 3s in " + num + " is: " + count);
    }
}
