package dec02;

public class projecteuler07 {
    public static boolean primechecker(int n) {
        if (n % 2 == 0) {
            return false;
        } else {
            int i;
            for(i=2;i<n;i++){
                if(n%i==0){
                    break;
                }
            }
            return i==n;
        }
    }

    public static void main(String[] args) {
        int count = 1, whichprimenumber = 10001;
        int i = 3;

        while (true) {
            if(primechecker(i)){
                count++;
            }
            if(count==whichprimenumber){
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}
