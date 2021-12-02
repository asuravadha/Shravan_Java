package dec02;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        data obj=new data();
        ArrayList<String> data=new ArrayList<>();
        data.add("Eswar");
        data.add("info");
        data.add("karan");
        data.add("mahanth");

        obj.setInfo(data);
        write.display();

    }
}
