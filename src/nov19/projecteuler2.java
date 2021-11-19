package nov19;

public class projecteuler2 {
    public static void main(String[] args){
        int a=1,b=2,c;

        int result=2;
        do {
            c = a + b;
            a = b;
            b = c;
            if (c % 2 == 0) {
                result += c;
            }

        } while (c <= 4000000);
        System.out.println(result);
    }
}
