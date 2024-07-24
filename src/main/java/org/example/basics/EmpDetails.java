package org.example.basics;

import java.util.Scanner;

public class EmpDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empno, monthlySalary, yearlySalary;
        String ename;
        System.out.println("Enter the empno:");
        empno = sc.nextInt();
        System.out.println("Enter the employee name:");
        ename = sc.next();
        System.out.println("Enter the monthly salary:");
        monthlySalary = sc.nextInt();
        yearlySalary = monthlySalary * 12;
        System.out.println("Hi " + ename + "! Your employee id is " + empno + ", monthly salary is Rs " + monthlySalary + " and yearly salary is Rs " + yearlySalary + ".");
        sc.close();
    }
}
