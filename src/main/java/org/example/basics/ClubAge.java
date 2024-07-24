package org.example.basics;

import java.util.Scanner;

public class ClubAge {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name;
        double age,mobNo;
        System.out.println("Enter the name:");
        name=sc.next();
        System.out.println("Enter the mobile number:");
        mobNo= sc.nextDouble();
        System.out.println("Enter the age:");
        age=sc.nextDouble();
        if(age<18)
            System.out.println("“Sorry! You need to be at least 18 years old to get membership.”");
        else
            System.out.println("“Congratulations "+name+" for your successful registration.”");
        sc.close();
    }
}
