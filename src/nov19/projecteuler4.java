package nov19;

public class projecteuler4 {
    public static  boolean palindrome(int n){
    String sn=String.valueOf(n);
    String temp="";
    for(int i=(sn.length()-1);i>=0;i--){
        temp += sn.charAt(i);
    }
    return sn.equals(temp);
    }
    public static void main(String[] args){
    boolean flag=false;
    for(int i=99;i>=10;i--){
        for(int j=99;j>=10;j--){
            int v=i*j;
            if(palindrome((v))){
                System.out.println(v);
                flag=true;
                break;
            }
        }
        if(flag){
            break;
        }
    }
    }
}
