package org.example.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float principal, time, rate, simpleInt;
        System.out.println("Enter the principal amount:");
        principal = sc.nextFloat();
        System.out.println("Enter the rate of interest");
        rate = sc.nextFloat();
        System.out.println("Enter the time (years)");
        time = sc.nextFloat();
        simpleInt = (principal * time * rate) / 100;
        System.out.println("Simple interest is " + simpleInt);
        sc.close();
    }
}
