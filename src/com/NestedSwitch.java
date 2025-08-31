package com;

import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {

            System.out.println("Check Employee Details: ");
            Scanner sc = new Scanner(System.in);
            int empId = sc.nextInt();
            String department = sc.next();

            switch (empId){
                case 1 -> System.out.println("William Byers");
                case 2 -> System.out.println("Max Mayfield");
                case 3 -> {
                    System.out.println("Emp no. 3: ");

                    switch (department) {
                        case "IT" -> System.out.println("IT Department.");
                        case "Management" -> System.out.println("Management Department.");
                        default -> System.out.println("No Department Entered.");
                    }
                }

                default -> System.out.println("Enter correct EmpID.");
            }
    }
}
