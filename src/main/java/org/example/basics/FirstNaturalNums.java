package org.example.basics;

import java.util.Scanner;

public class FirstNaturalNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number of natural numbers to be generated:");
        num = sc.nextInt();
        System.out.println("First 5 natural numbers are :");
        for (int i = 1; i <= num; i++) {
            System.out.print(i + " ");
        }
        sc.close();
    }
}
