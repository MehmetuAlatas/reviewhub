package generalReview;

import java.util.Arrays;
import java.util.Scanner;

public class Q03 {
    /*  Interview Question
	 	Create an array and get elements of array from user
	 	Put all zeros to end in an integer array
	 	{3, 0, 4, 2, 0} ==> {3, 4, 2, 0, 0}
	 	{0, 0, 1, 2, 0, 3} ==> {1, 2, 3, 0, 0, 0}
	 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the length of array");
        int length= scan.nextInt();

        int arr []=new int[length];
        System.out.println("Please enter the elements");
        for (int i = 0; i <length; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int brr []=new int[length];
        int k=0;
        for (int i = 0; i < length; i++) {
            if(arr[i]!=0){
                brr[k]=arr[i];
                k++;
            }
        }
        System.out.println(Arrays.toString(brr));



    }
}
