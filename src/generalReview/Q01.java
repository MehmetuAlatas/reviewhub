package generalReview;

import java.util.*;

public class Q01 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press *");
        String str = "";
        List<String> list = new ArrayList<>();
        while(!str.equals("*")){
            str=scan.nextLine();
            list.add(str);
        }
        System.out.println(list);
        Set<String>set=new HashSet<>(list);
        System.out.println(set);

    }
}
