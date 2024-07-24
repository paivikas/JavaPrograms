package org.example.basics;

public class SeriesFirstSeven {
    public static void main(String[] args) {
        int acc=1;
        double sum=0;
        System.out.println("Sum of 1/1!+2/2!+3 /3!+....7/7!");
        for (int i = 1; i <= 7; i++) {
            acc*=i;
            sum+=(double)i/(acc);
        }
        System.out.println(sum);
    }
}
