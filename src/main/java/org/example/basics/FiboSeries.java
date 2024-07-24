package org.example.basics;

import java.util.Scanner;

public class FiboSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, a = 0, b = 1, temp;
        System.out.println("Enter the upper bound number to generate the Fibonacci numbers:");
        num = sc.nextInt();
        System.out.print("Fibonacci series up to the entered number is:" + a + " " + b + " ");
        while ((a + b) <= num) {
            temp = a + b;
            a = b;
            b = temp;
            System.out.print(temp + " ");
        }
        sc.close();
    }
}
