package Lecture1_Firstjava;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Principlerat   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle");
        int p =sc.nextInt();
        System.out.println("Enter rate");
        float r = sc.nextFloat();
        System.out.println("Enter time duration");
        float t = sc.nextFloat();

        float si = (p*r*t)/100;
        System.out.println(si);

    }
}
