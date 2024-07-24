package org.example.basics;

import java.util.Scanner;

public class PositiveDiff {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the first number num1:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number num2:");
        num2 = sc.nextInt();
        System.out.println("The result (difference) is:" + (Math.max(num1, num2) - Math.min(num1, num2)));
        sc.close();
    }
}
