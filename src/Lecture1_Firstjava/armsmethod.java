package Lecture1_Firstjava;

import java.util.Scanner;

public class armsmethod {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        check(n,m);
    }

    static void check(int num1, int num2){


        for (int i = num1 ; i <num2; i++){
            int sum= 0;
            int check = i;
            int rem = 0;
            while(check>0){
                rem = check%10;
                sum = sum + rem *rem*rem;
                check = check/10;
            }
            if (sum == i ){

                System.out.println(i + " ");
            }
        }

    }
}
