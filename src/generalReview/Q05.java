package generalReview;

import java.util.Arrays;
import java.util.HashMap;

public class Q05 {    /*
  How to count the number of occurrences of the letters(alphabetical characters) in a sentence
  For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
                j=3, a=..,
                Make code case insensitive..
*/

    public static void main(String[] args) {
        String str="Java is easy. Type codes to learn Java. To earn money learn Java.";
        String arr[] =str.toLowerCase().replaceAll("\\W","").split("");
        System.out.println(Arrays.toString(arr));
        HashMap<String,Integer>hm=new HashMap<>();
        for (String w:arr){
            if(!hm.containsKey(w)){
                hm.put(w,1);
            }else{
                hm.put(w,hm.get(w)+1);
            }

        }
        System.out.println(hm);

    }
}
