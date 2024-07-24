package org.example.basics;

import java.util.Scanner;

public class LowHighBound {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int high, low;
        System.out.println("Enter the lower bound value:");
        low = sc.nextInt();
        System.out.println("Enter the upper bound value:");
        high = sc.nextInt();
        System.out.print("The prime numbers between " + low + " and " + high + " are:");
        for (int i = low; i <= high; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }
}
