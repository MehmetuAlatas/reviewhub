package generalReview;

import java.util.Arrays;

public class Q02 {
    /*
     Create an array and create a  method to find the number of positive numbers and sum of
	 the non-positive numbers
	 Return type must be int array
	 [a,b]		 */
    public static void main(String[] args) {
        int brr[] = {2, 6, 1, -9, -7, -2}; // [3, -18]
        System.out.println(Arrays.toString(sumOfPosandnum(brr)));

    }

    public static int[] sumOfPosandnum(int[] arr) {
        int numofpositive = 0;
        int sumofneg = 0;
        for (int w : arr) {
            if (w >= 0) {
                numofpositive++;
            } else {
                sumofneg += w;
            }
        }
        int result[] = {numofpositive, sumofneg};
        return result;
    }
}

