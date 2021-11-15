package nov15;

import java.util.Scanner;

public class Main extends data {
    public static void main(String[] args){
        System.out.println("programm started");
        Scanner input=new Scanner(System.in);
        String[][] auth =new String[2][10];
        int index=0;
        boolean flag=true;
        while(true){
            System.out.println("Enter s for signup l for login any other to quit ");
            String option=input.next();
            String username,password;
            if(option.equals("s")){
                System.out.println("\n\n\nsignup\n\n\n");
                System.out.println("Enter username");
                username=input.next();
                System.out.println("Enter password");
                password=input.next();
                auth[0][index]=username;
                auth[1][index]=password;
                index++;
            }else if(option.equals("l")){
                System.out.println("\n\n\nlogin\n\n\n");
                System.out.println("Enter username");
                username=input.next();
                System.out.println("Enter password");
                password=input.next();
                for(int i=0;i<index;i++){
                    if(username.equals(auth[0][i])){
                        flag=false;
                        if(password.equals(auth[1][i])){
                            System.out.println("Logged in successfully");
                        }
                        else{
                            System.out.println("password wrong");
                        }
                    }

                }
                if(flag){
                    System.out.println("User name not found");
                }

            }else{
                System.out.println("end of programm logging out");
                break;
            }


        }



//        for(int i=0;i<10;i++){
////            if(i==5){
////                break;  //breaks the loop
////            }
////            if(i==5){
////                continue;  //skips the iterator instance
////            }
//            System.out.println(i);
//        }


//        info("static method can be accessed directly as main class in inheriting data class properties");
//        data obj=new data();
//        obj.oinfo("non static method can be accessed only through an object");
    }
}
