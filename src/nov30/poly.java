package nov30;

public class poly {
    public static void add(int a,int b){
        System.out.println(a+b);
    }
    public static void add() {
        System.out.println("empty");
    }
    public static void add(int p,int q,int r) {
        System.out.println(p+q+r);
    }
    public static void add(int[] data) {
    int result=0;
    for(int i:data){
        result+=i;
    }
    System.out.println(result);
    }
}
