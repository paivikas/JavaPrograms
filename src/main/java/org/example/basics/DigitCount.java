package org.example.basics;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, sum = 0;
        System.out.println("Enter any number:");
        num = sc.nextInt();
        while (num != 0) {
            num/=10;
            sum++;
        }
        System.out.println("The number of digits in the entered number is "+sum);
        sc.close();
    }
}
