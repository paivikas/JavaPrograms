package org.example.basics;

import java.util.Scanner;

public class SwapTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        System.out.println("Enter the first number num1:");
        num1 = sc.nextInt();
        System.out.println("Enter the second number num2:");
        num2 = sc.nextInt();
        System.out.println("Before swap, the values of num1=" + num1 + " and num2=" + num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After swap, the values of num1=" + num1 + " and num2=" + num2);
        sc.close();
    }
}
