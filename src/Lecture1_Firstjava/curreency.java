package Lecture1_Firstjava;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class curreency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter indian rupee");
        float r = sc.nextFloat();
        System.out.println("In Dollar $" + (r/82));
    }
}
