package generalReview;

import java.util.LinkedList;

public class Q13 {
    public static void main(String[] args) {/*
     Node'lari "Ali", "Veli", "Can" ve "Ayse" olan bir LinkedList olusturun.
Kullanicidan bir isim alin. Bu isim LinkedList'de varsa silin ve kullaniciya "Bu isim
LinkedList'de vardi ve silindi“ diye mesaj verin.
Bu isim LinkedList'de yoksa "Bu isim LinkedList'de yok bu yuzden silinemedi" diye mesaj
verin    */
        LinkedList<String> ll = new LinkedList<>();
        ll.add("ali");
        ll.add("veli");
        ll.add("can");
        ll.add("ayse");
        String user = "deli";
        System.out.println(ll);
        if (ll.remove(user)) {
            System.out.println("This words removed=> "+ll);
            System.out.println(ll);
        } else {
            System.out.println(user+"=> This words can not be removed because of not exist=> "+ll);

        }


    }
}
