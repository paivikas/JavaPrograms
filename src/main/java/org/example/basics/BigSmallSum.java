package org.example.basics;

import java.util.Scanner;

public class BigSmallSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of a 3X3 matrix:");
        int[][] twoD_arr = new int[3][3];
        int big=Integer.MIN_VALUE,small=Integer.MAX_VALUE,sum=0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                twoD_arr[i][j]= sc.nextInt();
                sum+=twoD_arr[i][j];
                big=Math.max(big,twoD_arr[i][j]);
                small=Math.min(small,twoD_arr[i][j]);
            }
        }
        System.out.println("The biggest element is:"+big+"\nThe smallest element is:"+small+"\nThe sum of all elements is:"+sum);
        sc.close();
    }
}
