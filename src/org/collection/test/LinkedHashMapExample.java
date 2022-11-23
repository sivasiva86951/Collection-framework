package org.collection.test;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		
		LinkedHashMap<Integer, String>  map=new LinkedHashMap<>();
		map.put(101, "A");
		map.put(102, "B");
		map.put(103, "C");
		map.put(104, "D");
		map.put(105, "E");
		
		
		System.out.println(map);
		
		
		
		Iterator itr=map.keySet().iterator();
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		Iterator itr1=map.values().iterator();
		
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey() + " "+m.getValue());
		}
	}

}

