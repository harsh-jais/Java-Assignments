package Lecture1_Firstjava;

public class armstrongg {
    public static void main(String[] args) {
        if (mm(222)== false){

            System.out.println("it is a armstrong number");
        }
        else {
            System.out.println("it is not a armstrong number");
        }
    }
    static Boolean mm(int n){
        int original =n ;
        Boolean flag = true;
        int sum = 0;
        while(n>0){

            int rem = n %10;
            sum =sum + rem*rem*rem;
            n= n/10;

        }
        if (sum == original){
            flag = false;
        }

        return flag;
    }
}
