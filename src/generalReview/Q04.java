package generalReview;

import java.util.Scanner;

public class Q04 {   /*
 * Ask user to enter 2 positive integer then find
 * GCD (The Greatest Common Divisor) and
 * (if user enter 30 and 40 GCD = 10 )
 */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int gcd=0;
        for (int i = 1; i <num1 && i<num2 ; i++) {
            if(num1%i==0 && num2%i==0 ){
                gcd=i;
            }
        }
        System.out.println(gcd);


    }
}
