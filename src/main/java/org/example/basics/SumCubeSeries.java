package org.example.basics;

import java.util.Scanner;

public class SumCubeSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        float sum = 0;
        System.out.println("Enter a number:");
        num = sc.nextInt();
        System.out.print("The sum of the series 1+1/2^3+1/3^3+……….+1/" + num + "^3 is: ");
        for (float i = 1; i <= num; i++) {
            sum += (1 / (i * i * i));
        }
        System.out.println(sum);
        sc.close();
    }
}
