package Lecture1_Firstjava;

import java.util.Scanner;

public class fibonac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n number to Calculate Fibonacci Number");
        int n = sc.nextInt();
        int a = 0 ;
        int b = 1;
        for (int i = 2; i <= n ; i++){
            int sum = a+b;
            a= b;
            b = sum;
            System.out.println(sum + " ");
        }

    }
}
