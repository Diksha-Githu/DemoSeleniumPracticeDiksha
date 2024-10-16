package Practices;

import java.util.HashMap;

public class OccuranceOfString {
public static void main(String args[]){

    String str="Java Java Program Demo No Demo No No No";
    String[] sr=str.split(" ");

    HashMap<String, Integer> map=new HashMap<>();
    for(int i=0;i<sr.length-1;i++) {
        if(map.containsKey(sr[i])){
            map.put(sr[i],map.get(sr[i])+1);
        }else{
            map.put(sr[i],1);
        }

    }
    for(String a: map.keySet()){
        System.out.println(a + " : "+map.get(a));
    }
    }
}
