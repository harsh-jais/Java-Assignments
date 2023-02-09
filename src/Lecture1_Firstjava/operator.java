package Lecture1_Firstjava;

import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y =sc.nextInt();
        System.out.println("Enter an operator + / - _ / _ /*/  ");
        char ch = sc.next().charAt(0);
        if (ch == '+'){
            System.out.println(x+y);
        } else if (ch == '-') {
            System.out.println(x-y);

        }
        else if (ch == '/'){
            System.out.println(x/y);
        } else if (ch == '*') {
            System.out.println(x*y);

        }else
            System.out.println("Wring input");

    }
}
