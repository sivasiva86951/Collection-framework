package org.collection.test;
   
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    public static void main(String[] args) {
        
        HashSet<String> set=new HashSet<>();
        
        set.add("P");
        set.add("J");
        set.add("Z");
        set.add("A");
        set.add("C");
        set.add("P");       
        set.add(null);
        
        
        System.out.println(set);

        System.out.println(set.addAll(Arrays.asList("H","Y")));
        System.out.println(set.contains("A"));
        System.out.println(set.containsAll(Arrays.asList("H","Y")));
        System.out.println(set.isEmpty());
        System.out.println(set.remove("C"));
        System.out.println(set);
        
        
        for(String a:set)
        {
            System.out.println(a);
        }
        
        Iterator<String> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}

