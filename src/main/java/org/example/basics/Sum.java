package org.example.basics;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, sum;
        System.out.println("Enter the num1 value:");
        num1 = sc.nextInt();
        System.out.println("Enter the num2 value:");
        num2 = sc.nextInt();
        sum = num1 + num2;
        System.out.println("Sum of " + num1 + " and " + num2 + " is " + sum);
        sc.close();
    }
}
