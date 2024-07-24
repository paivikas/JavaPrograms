package org.example.basics;

import java.util.Scanner;

public class SumSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        System.out.print("The sum of the series ");
        for (int i = 0; i < num; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("is: " + sum);
        sc.close();
    }
}
