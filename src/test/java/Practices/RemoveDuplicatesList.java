package Practices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesList {

    public static void main(String args[]){
        ArrayList al=new ArrayList();
        al.add(10);
al.add(30);
al.add(10);
al.add(40);
al.add(40);
al.add(40);


        HashSet set=new HashSet(al);
            al.clear();
        al.add(set);

        System.out.println(set);

    }
}
