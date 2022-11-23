package org.collection.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;

public class HashTableExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        Hashtable<Integer, String> table=new Hashtable<>();
        
        table.put(123, "A");
        table.put(124, "B");
        table.put(125, "C");
        table.put(126, "D");
        table.put(127, "E");
        table.put(156, "A");
        
        System.out.println(table.contains("M"));
        System.out.println(table.get(127));
        System.out.println(table.contains("D"));
        System.out.println(table.containsKey(125));
        System.out.println(table.containsValue("E"));
        
        table.getOrDefault(128, "X");
        System.out.println(table.putIfAbsent(129, "Z"));
        System.out.println(table.remove(127));
        
        table.forEach((k,v) -> System.out.println(k + " "+v ));
        
        //iterating on the keys of hashtable
        Enumeration<Integer> keys= table.keys();       
        Iterator<Integer> itr=(Iterator<Integer>) keys.asIterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
        
        
        //iterating on the values of hashtable
        Collection<String> values=table.values();
        Iterator<String> itr1=(Iterator<String>) values.iterator();
        
        while(itr1.hasNext())
        {
            System.out.println(itr1.next());
        }
        
        
        System.out.println(table);

    }

}
