package org.example.basics;

import java.util.Scanner;

public class Mult19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number to generate its multiplication table:");
        num = sc.nextInt();
        System.out.println("Multiplication table for 19 is :");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + (num * i));
        }
        sc.close();
    }
}
