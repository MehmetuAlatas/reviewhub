package generalReview;

import java.util.HashSet;
import java.util.TreeSet;

public class Q11 {
    /*
       If you need to use elements in a natural order, then use TreeSet it will sort elements in ascending order.
       HashSet is faster than TreeSet but TreeSet can order elements.
        */
    public static void main(String[] args) {        /*
        Interview Question: How to store unique elements in natural order?
        We can use TreeSet.
        Yes, but as you know it is slow. how can you make it faster?
        I will create a HashSet and add all elements to a HashSet then I can convert it to a TreeSet
         */
        Long t1 = System.nanoTime();
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(35);
        ts.add(12);
        ts.add(58);
        ts.add(0);
        ts.add(-9);
        ts.add(2);
        ts.add(12);
        ts.add(35);
        System.out.println(ts);//[-9, 0, 2, 12, 35, 58]

        Long t2 = System.nanoTime();

        HashSet<Integer> hs1 = new HashSet<>();
        hs1.add(35);
        hs1.add(12);
        hs1.add(58);
        hs1.add(0);
        hs1.add(-9);
        hs1.add(2);
        hs1.add(12);
        hs1.add(35);
        System.out.println(hs1);//[-9, 0, 2, 12, 35, 58]
       TreeSet<Integer>ts2=new TreeSet<>(hs1);
        System.out.println(ts2);
        Long t3 = System.nanoTime();
        System.out.println("TreeSet worktime ==> "+(t2-t1)+" \nHashSet worktime ==> "+(t3-t2));




    }
}