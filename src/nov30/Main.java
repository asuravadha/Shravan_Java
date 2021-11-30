package nov30;



public class Main extends poly{
    public static void add(){
        System.out.println("hi main add overwriting polyclass");
    }
    public static void main(String[] args){
        add();
        add(1,2);
        add(1,2,3);
        int[] d=new int[]{1, 2, 3,345,3453,5345,34534};
        add(d);
    }




}
