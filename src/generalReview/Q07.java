package generalReview;

import java.util.*;

public class Q07 {     /*
	 	Create a list by getting the list elements from user
	 	If there is duplicated elements remove them from the list(you can use sets)
	 	Note: Give a message to the user as "Enter list elements, to stop entrance press '*'"
	*/
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter list elements, to stop entrance press '*'");
        String str = "";
        List<String> list = new ArrayList<>();
        while (!str.contains("*")) {
            str = scan.nextLine();
            if (!str.contains("*"))
                list.add(str);
        }
        System.out.println(list);
        Set<String> set = new HashSet<>(list);
        System.out.println(set);


    }
}
