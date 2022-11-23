package org.collection.test;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionMethods {

    public static void main(String[] args) {
        
        List<Integer> list=new ArrayList<Integer>();
        
        Collections.addAll(list, 11,23,44,55,44);
        
        
    
        
        
        System.out.println(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(Collections.frequency(list, 44));
        System.out.println(Collections.replaceAll(list, 55, 65));
        
        
        System.out.println(list);
        
        Collections.sort(list);
        System.out.println(list);
        
        Collections.shuffle(list);
        
        System.out.println(list);
        
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }

}

