package org.example.basics;
import java.util.Scanner;
public class CountNofOfPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num,digit,count=0;
        System.out.println("Enter a number:");
        num= sc.nextInt();
        while (num!=0)
        {
            digit=num%10;
            num/=10;
            int flag=0;
            for (int i = 2; i < digit; i++) {
                if((digit%i)==0){
                    flag=1;
                    break;
                }
            }
            if(flag==0&&digit!=1) {
                count++;
            }
        }
        System.out.println("Number of prime digits in the entered number is "+count);
        sc.close();
    }
}
