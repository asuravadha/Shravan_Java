package nov26;

import java.util.Scanner;

public class Main extends data {
    public static void main(String[] args){
        problem();
    }
}

class data{
    public static void problem(){
        System.out.println("choose option \n 1)1 million 2)1 dollar which will be doubled for 30 days");
        Scanner input=new Scanner(System.in);
        String option=input.next();
        if(option.equals("1")){
            System.out.println("you won 1 million");
        }
        else if(option.equals("2")){
            int money=1;
            for(int i=1;i<=30;i++){
                money+=money;
                System.out.println("for "+i +"day" +money);
            }
            System.out.println("you own "+money+" dollars");
        }
        else{
            System.out.println("invalid option");
        }
    }
}
