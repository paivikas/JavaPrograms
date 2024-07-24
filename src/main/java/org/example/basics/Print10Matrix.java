package org.example.basics;

public class Print10Matrix {
    public static void main(String[] args) {
        int num=0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 4-i; j >=0 ; j--) {
                System.out.print(++num+" ");
            }
            System.out.println();
        }
    }
}
