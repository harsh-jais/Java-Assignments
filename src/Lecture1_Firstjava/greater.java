package Lecture1_Firstjava;

import java.util.Scanner;

public class greater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x>y){
            System.out.println(" is greater");
        }
        else {
            System.out.println("y is greater");
        }
    }
}
