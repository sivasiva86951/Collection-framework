package org.collection.test;

import java.util.Arrays;
import java.util.Vector;

public class VectorDemo {
    
    public static void main(String args[])
    {
        
        Vector<Integer> vlist=new Vector<>();
        
        vlist.add(123);
        vlist.add(124); //1 
        vlist.add(125);
        vlist.add(126);
        vlist.add(127);
        vlist.add(127);
        
        System.out.println(vlist);
        
        Vector<String> vlist1=new Vector<>();
        vlist1.add("A");
        vlist1.add("E");
        vlist1.add("I");
        vlist1.add("O");
        vlist1.add(null);
        vlist1.add("U");
        System.out.println(vlist1);
        
        Vector<Integer> vlist2=new Vector<>(Arrays.asList(23,56,78,44));
        Vector<Integer> vlist3=new Vector<>(20);
        Vector<Integer> vlist4=new Vector<>(20,10);
        
        
        System.out.println(vlist.capacity());//10
        vlist.ensureCapacity(50);
        System.out.println(vlist.capacity());
        System.out.println(vlist.contains(45));
        System.out.println(vlist.addAll(Arrays.asList(56,78,90)));
        System.out.println(vlist);
        System.out.println(vlist.containsAll(Arrays.asList(126,127)));

        System.out.println(vlist.add(127));
        System.out.println(vlist);
        
        
        for(int i=0;i<vlist.size();i++)
        {
            System.out.println(vlist.get(i));
        }
        
        vlist.set(1, 201);
        System.out.println(vlist);
        
        vlist.remove(0);
        System.out.println(vlist);
    }

}
