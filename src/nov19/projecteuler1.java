package nov19;

public class projecteuler1 {
    public static void main(String[] args){
       int result=0;
        for(int i=1;i<1000;i++){
            if(i%3==0 || i%5==0){
                result=result+i;
            }
        }
        System.out.println(result);


    }
}
