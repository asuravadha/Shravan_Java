public class nov11 {
//    String name;
//    static String job;

    // non static  arg no return
//    public static void greetings(String name,String who){
//
//        if(who.equals("friend")){
//            System.out.println(name +"how are you ");
//        }
//        else if(who.equals("enemy")){
//            System.out.println(name +"what do you want ");
//        }
//        else{
//            System.out.println(name+" ? do i know you");
//        }
//    }


// arg return
    public static String greetings(String name,String who){

        if(who.equals("friend")){
            System.out.println("hi");
            return name +" how are you ";
        }
        else if(who.equals("enemy")){
            return name +"what do you want ";
        }
        else{
            return name+" ? do i know you";
        }
    }



    public static void main(String[] args){


        System.out.println(greetings("Eswar","friend"));





//        nov11 obj1=new nov11();
//        nov11 obj2=new nov11();
//
//        obj1.name="Eswar";
//        obj2.name="anjali";
//
//        obj2.job="bye";
//        obj1.job="hai";
//
//
//        System.out.println(obj1.name+obj2.name);
//        System.out.println(obj1.job+obj2.job);





    }
}
