package Lecture1_Firstjava;

import java.util.Scanner;

public class greeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name");
        String name =  sc.next();
        System.out.println("Hello " + name);

    }
}
