package org.example.basics;

import java.util.Scanner;

public class WeightOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float weight1, weight2, weight3, sum, avg;
        System.out.println("Enter the weight of the first person:");
        weight1 = sc.nextFloat();
        System.out.println("Enter the weight of the second person:");
        weight2 = sc.nextFloat();
        System.out.println("Enter the weight of the third person:");
        weight3 = sc.nextFloat();
        sum = weight1 + weight2 + weight3;
        avg = sum / 3;
        System.out.println("The sum of weight of the 3 persons is " + sum + " Kgs and the average weight is " + avg + " Kgs");
        sc.close();
    }
}
