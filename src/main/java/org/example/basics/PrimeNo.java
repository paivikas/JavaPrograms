package org.example.basics;

import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, flag = 0;
        System.out.println("Enter any number:");
        num = sc.nextInt();
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("The entered number " + num + " is not a prime number");
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            System.out.println("The entered number " + num + " is a prime number");
        sc.close();
    }
}
