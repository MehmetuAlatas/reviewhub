package generalReview;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Q12 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(13);
        list.add(2);
        list.add(56);
        list.add(23);
        list.add(45);
        list.add(14);
        list.add(40);
        System.out.println(list);
        ListIterator<Integer>li=list.listIterator();
//        while (li.hasNext()){
//            if((li.next()<22 )){
//                li.remove();
//            }
//        }
//        while (li.hasNext()){
//            li.next();
//        }
//        while (li.hasPrevious()){
//            System.out.print(li.previous()+" ");
//        }
//
        int n=3;
        for (int i = 0; i < n; i++) {
             li.set(li.next()+10);
        }
        System.out.println(list);




    }
}
