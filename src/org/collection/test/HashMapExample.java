package org.collection.test;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {
        
        HashMap<Integer, String> hashmap=new HashMap<>();
        
        hashmap.put(1, "A");
        hashmap.put(2, "B");
        hashmap.put(3, "C");
        hashmap.put(4, "D");
        hashmap.put(5, "E");
        
        System.out.println(hashmap);
        
        System.out.println(hashmap.containsKey(5));
        System.out.println(hashmap.containsValue("F"));
        System.out.println(hashmap.get(3));
        System.out.println(hashmap.getOrDefault(7, "Z"));
        System.out.println(hashmap.putIfAbsent(3, "F"));
        System.out.println(hashmap.remove(5));
        System.out.println(hashmap.remove(4, "d"));
        System.out.println(hashmap.size());
        
        
        System.out.println(hashmap);

    }

}
