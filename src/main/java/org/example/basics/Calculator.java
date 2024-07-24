package org.example.basics;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, operator;
        System.out.println("Enter num1:");
        num1 = sc.nextInt();
        System.out.println("Enter num2:");
        num2 = sc.nextInt();
        System.out.println("1. add 2. sub 3. mul 4. div 5. mod");
        operator = sc.nextInt();
        switch (operator) {
            case 1:
                System.out.println("Result:" + (num1 + num2));
                break;
            case 2:

                System.out.println("Result:" + (num1 - num2));
                break;
            case 3:

                System.out.println("Result:" + num1 * num2);
                break;
            case 4:
                if (num2 == 0)
                    System.out.println("Divide by 0 error");

                System.out.println("Result:" + num1 / num2);
                break;
            case 5:

                System.out.println("Result:" + num1 % num2);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }

    }
}
