package generalReview;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Q09 { /*
    Create a MAP that will have following keys and values
    Math = 9
    English = 8
    Biology = 7
    History = 6
    French = 7
    Then print all lessons and their scores that are more than 7     */
    public static void main(String[] args) {
        HashMap<String , Integer> hm1 = new HashMap<>();
        hm1.put("Math", 9);
        hm1.put("English", 8);
        hm1.put("Biology", 7);
        hm1.put("History", 6);
        hm1.put("French", 7);

        System.out.println(hm1);
        Set<Map.Entry<String,Integer>> entrySet=hm1.entrySet();
        for(Map.Entry<String,Integer> w:entrySet ){
            if(w.getValue()>7){
                System.out.println(w);
            }
        }

    }

}
