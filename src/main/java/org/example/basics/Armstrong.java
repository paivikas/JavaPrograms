package org.example.basics;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, digit, temp, noOfDigits = 0;
        double sum = 0;
        System.out.println("Enter any number: ");
        num = sc.nextInt();
        temp = num;
        while (temp != 0) {
            temp /= 10;
            noOfDigits++;
        }
        temp = num;
        while (temp != 0) {
            digit = temp % 10;
            temp /= 10;
            sum += Math.pow(digit, noOfDigits);
        }
        if (num == sum)
            System.out.println(num + " is an Armstrong number.");
        else System.out.println(num + " is not an Armstrong number.");
    }
}
