package org.collection.test;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

    public static void main(String[] args) {
    
        LinkedList<Integer> list=new LinkedList<>(Arrays.asList(23,56,78,44));
        list.add(12);
        list.add(23);
        list.add(78);
        
        System.out.println(list);
        
        for(int i=0;i<list.size();i++) 
          { 
          
                  System.out.println(list.get(i));
              
          }
        
         for(Integer element:list) 
          { 
              System.out.print(element+" ");
              
          }
         
         
         Iterator<Integer> itr = list.iterator();

            while (itr.hasNext()) {
                System.out.print("\n"+itr.next()+" ");
            }
         
        list.addAll(new LinkedList<>(Arrays.asList(3,4,5,6,8)));
        
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(45));
        System.out.println(list.indexOf(23));
        System.out.println(list.removeFirst());
        System.out.println(list.removeLast());
        System.out.println(list.removeAll(Arrays.asList(3,4,5)));
        System.out.println(list);
    }

}

