import java.util.Scanner;

public class Recursion {

    public static void main (String[]args){

        Scanner sc= new Scanner (System.in);
        System.out.println("Please enter number: ");
        int num= sc.nextInt();



        System.out.println(factorial(num));

    }
    public static int factorial(int x){
       if (x==0){
           return 1;
       }    else {
           return x * factorial (x-1);
       }


    }



}
