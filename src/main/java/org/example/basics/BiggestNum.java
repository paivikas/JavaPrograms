package org.example.basics;

import java.util.Scanner;

public class BiggestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Enter the 1st number num1:");
        num1 = sc.nextInt();
        System.out.println("Enter the 2nd number num2:");
        num2 = sc.nextInt();
        System.out.println("Enter the 3rd number num2:");
        num3 = sc.nextInt();
        System.out.println("The biggest of the 3 numbers entered is: " + (Math.max(num1, Math.max(num2, num3))));
        sc.close();
    }
}
