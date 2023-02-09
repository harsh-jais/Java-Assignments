package Lecture1_Firstjava;

import java.util.Scanner;
import java.util.stream.StreamSupport;

public class palindrop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        String rev = "";
        for (int i = name.length() - 1; i >=0; i--){
        rev = rev + name.charAt(i);
        }
       if (name.equals(rev)){
           System.out.println("it is a pallindrome");
       }
       else {
           System.out.println("it is not a pallindrome");
       }
    }
}
