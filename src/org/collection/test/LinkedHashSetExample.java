package org.collection.test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        
        LinkedHashSet<Integer> set=new LinkedHashSet<>();
        set.add(13);
        set.add(23);
        set.add(78);
        set.add(90);
        set.add(56);
        set.add(55);
        set.add(23);
        set.add(null);
        
        System.out.println(set);

        System.out.println(set.addAll(Arrays.asList(22,99)));
        System.out.println(set.contains("A"));
        System.out.println(set.containsAll(Arrays.asList(22,99)));
        System.out.println(set.isEmpty());
        System.out.println(set.remove("C"));
        System.out.println(set);
        
        
        for(Integer a:set)
        {
            System.out.println(a);
        }
        
        Iterator<Integer> itr=set.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }

}
