package org.example.basics;

import java.util.Scanner;

public class NaturalDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter the number of natural numbers to be generated:");
        num = sc.nextInt();
        System.out.print("The first " + num + " natural numbers in descending order are:");
        while (num != 0) {
            System.out.print(num + " ");
            num--;
        }
        sc.close();
    }
}
