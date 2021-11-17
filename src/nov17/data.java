package nov17;

import java.util.Scanner;

public class data {
    public static void invoke(){

        Scanner input=new Scanner(System.in);
        System.out.println("Enter you choice a,b,c,d,e,f");
        String option=input.next();
        switch (option) {
            case "a" -> System.out.println("you selecte a");
            case "b" -> System.out.println("you selecte b");
            case "c" -> System.out.println("you selecte c");
            case "d" -> System.out.println("you selecte d");
            case "e" -> System.out.println("you selecte e");
            default -> System.out.println("invalid choice");
        }

    }
}
