package Practices;

import java.util.HashMap;

public class DuplicatesInString {

    public static void main(String args[]){


    String str="Diksha aik";
    String sr=str.toLowerCase();

        char[] s=sr.toCharArray();

        HashMap<Character, Integer> map=new HashMap<>();
        for(char ch:s){
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }
            else{
                map.put(ch,1);
            }
        }
        for(Character ch:map.keySet()){
            System.out.println("Char is "+ch +" : " +map.get(ch));
        }
    }
}
