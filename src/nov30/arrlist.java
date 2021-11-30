package nov30;

import java.util.ArrayList;

public class arrlist extends poly {
    public arrlist(){
        ArrayList<String> data=new ArrayList<>();
        data.add("Eswar");
        data.add("anjali");
        add(data);
        System.out.println(data.get(0));
    }
}
