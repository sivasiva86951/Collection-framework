package org.collection.test;

import java.util.Collections;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        
        TreeSet<String> set=new TreeSet<>();
        
        set.add("G");
        set.add("L");
        set.add("N");
        set.add("M");
        set.add("Z");
        set.add("D");
        set.add("A");
        set.add("L");
        //set.add(null);
        System.out.println(set);
        System.out.println(set.contains("D"));
        System.out.println(set.pollFirst());
        System.out.println(set.pollLast());
        System.out.println(set);
        System.out.println(set.last());
        System.out.println(set.first());
        System.out.println(set);
        
        
        for(String s:set )
        {
            System.out.println(s);
        }
        
      //Set<String> set1=Collections.synchronizedSet(set);
        
    }

}
