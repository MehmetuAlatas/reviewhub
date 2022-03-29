package generalReview;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Q10 {
    public static void main(String[] args) {
        HashMap<String, Integer> hm1 = new HashMap<>();
        hm1.put("Math", 8);
        hm1.put("Java", 9);
        hm1.put("SDLC", 9);
        hm1.put("API", 7);
        System.out.println(hm1);

        Set<String> keySet = hm1.keySet();
        for (String w : keySet) {
            System.out.println(w);
        }

        Collection<Integer> values = hm1.values();
        for (Integer w : values) {
            System.out.println(Math.abs(w));
            // System.out.println(w);

        }

        Set<Map.Entry<String, Integer>> entrySet = hm1.entrySet();
        for (Map.Entry<String, Integer> w : entrySet) {
             System.out.println(w);
            //System.out.println(w.getKey());
           // System.out.println(w.getValue());

        }


    }

}
