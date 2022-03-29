package generalReview;

import java.util.Arrays;
import java.util.HashMap;

public class Q08 {    /*
            How to count the number of occurences of the words in a sentence
            For example; "Java is easy. Type codes to learn Java. To earn money learn Java."
                          Java=3, is=1, easy=1, Type=1, ... , learn=2, ...
                          get rid of punctuation
                          split the words into array     */
    public static void main(String[] args) {

        String str="Java is easy. Type codes to learn Java. To earn money learn Java.";
        String arr[]=str.toLowerCase().replaceAll("\\p{Punct}","").split(" ");
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer>hm=new HashMap<>();
        for(String w:arr){
            if(!hm.containsKey(w)){
                hm.put(w,1);
            }else {
                hm.put(w,hm.get(w)+1);
            }
        }
        System.out.println(hm);


    }
}
