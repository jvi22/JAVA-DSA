package com;

import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        System.out.println("Enter Fruit!");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();

//clean code without writing break statements

        switch (fruit){
            case "Mango" -> System.out.println("King of fruits.");
            case "Apple" -> System.out.println("Sweet red fruit.");
            case "Banana" -> System.out.println("Full of potassium.");
            case "Grapes" -> System.out.println("Small fruit.");
            default -> System.out.println("Invalid Entry.");
        }
    }
}

