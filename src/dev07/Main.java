package dev07;

import java.util.HashMap;

public class Main {
    public static void main(String[] args){
        HashMap<String,String> username=new HashMap<>();

        username.put("Eswar","he is from bangalore");
        username.put("anjali","she is from tirupati");
        username.put("karthik","from dharmavaram");

        System.out.println(username.get("Eswar"));
        for(String k:username.keySet()){
            System.out.println(k+username.get(k));
        }

    }

}
