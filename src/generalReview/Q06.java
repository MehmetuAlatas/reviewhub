package generalReview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q06 {
    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Honda", 2021);
        map1.put("Toyota", 2018);
        map1.put("Porche", 2020);
        map1.put("Ferrari", 2017);
        map1.put("Mercedes", 2013);
        System.out.println(map1);
//Print all key value pairs ==> My car is Honda and the year is 2021

        Set<Map.Entry<String,Integer>> entrySet=map1.entrySet();
        for (Map.Entry<String,Integer> w :entrySet  ) {
            System.out.println("My car is "+w.getKey()+" and the year is "+ w.getValue());
        } /*                        My car is Ferrari and the year is 2017
                                    My car is Toyota and the year is 2018
                                    My car is Porche and the year is 2020
                                    My car is Mercedes and the year is 2013
                                    My car is Honda and the year is 2021
                                     */

    }
}
