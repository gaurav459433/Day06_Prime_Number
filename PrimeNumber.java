package com.bridgelabz.rfp212.assignday06primenumber;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        // Print number prime number or not
        int num, i, cf = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("\nPlease Enter Any Number");
        num = sc.nextInt();
        //do .... while statement
        i = 1;
        do {
            if (num % i == 0) //It means i is the factor of num
                cf++; //cf=cf+1
            if(cf > 2 )
                break;
            i++;
        }
        while (i <= num);
        if (cf == 2)
            System.out.println(num+" is a Prime Number");
        else
            System.out.println(num+" is Not Prime Number");
    }
}
