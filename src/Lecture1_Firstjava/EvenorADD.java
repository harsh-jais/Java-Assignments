package Lecture1_Firstjava;

import java.util.Scanner;

public class EvenorADD {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2==0){
            System.out.println("it is a even");
        }
        else {
            System.out.println("it is odd number");
        }
    }

}
