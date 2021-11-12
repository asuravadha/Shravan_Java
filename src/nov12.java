import java.util.Scanner;

public class nov12 {
    //no arg no return
//    public static void greetings(){
//        Scanner input=new Scanner(System.in);
//        String who,name;
//        System.out.println("Enter name ");
//        name=input.next();
//        System.out.println("enter who you are");
//        who=input.next();
//        if(who.equals("friend")){
//            System.out.println("hi");
//           System.out.println( name +" how are you ");
//        }
//        else if(who.equals("enemy")){
//            System.out.println(name +"what do you want ");
//        }
//        else{
//            System.out.println(name+" ? do i know you");
//        }
//    }
    //no arg return
    public static String greetings(){
        Scanner input=new Scanner(System.in);
        String who,name;
        System.out.println("Enter name ");
        name=input.next();
        System.out.println("enter who you are");
        who=input.next();
        if(who.equals("friend")){
            System.out.println("hi");
            return  name +" how are you ";
        }
        else if(who.equals("enemy")){
            return name +"what do you want ";
        }
        else{
            return name+" ? do i know you";
        }

    }

    public static void main(String[] args){
        System.out.println(greetings());

    }
}
