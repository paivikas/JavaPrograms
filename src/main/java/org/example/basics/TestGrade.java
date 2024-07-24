package org.example.basics;

import java.util.Scanner;

public class TestGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstSub, secondSub, thirdSub, total;
        float avg;
        char grade;
        System.out.println("Enter the marks scored in 1st subject:");
        firstSub = sc.nextInt();
        System.out.println("Enter the marks scored in 2nd subject:");
        secondSub = sc.nextInt();
        System.out.println("Enter the marks scored in 3rd subject:");
        thirdSub = sc.nextInt();
        total = firstSub + secondSub + thirdSub;
        avg = (float) total / 3;
        if (avg <= 35.0)
            grade = 'C';
        else if (avg <= 60)
            grade = 'B';
        else
            grade = 'A';
        System.out.println("Total marks: " + total);
        System.out.println("Average is: " + avg);
        System.out.println("Grade: " + grade);
        sc.close();
    }
}
