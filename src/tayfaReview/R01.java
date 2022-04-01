package tayfaReview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class R01 {
    /*write a return method that can remove the duplicated values from string"     */
    public static void main(String[] args) {
        String str="AAABBBCCC";
        removeDublicated(str);

    }
    public static void removeDublicated(String str){
        String arr[]=str.split("");
       HashSet<String> set=new HashSet<>(Arrays.asList(arr));
        System.out.println(set);

    }}

