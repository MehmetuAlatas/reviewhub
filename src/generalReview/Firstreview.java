package generalReview;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Firstreview {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("k");
        list.add("e");
        list.add("i");
        System.out.println(list);
        ListIterator<String> li = list.listIterator();
        while (li.hasNext()){
            li.next();
        }
        while (li.hasPrevious()){
            if (li.previous().contains("b")) {
                li.remove();
            }

        }

        System.out.println(list);



    }
}
