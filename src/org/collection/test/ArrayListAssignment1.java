package org.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ArrayListAssignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list=new ArrayList<>();
		list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20));
		
		
		 ArrayList<Integer> evenList=new ArrayList<>();  
	        System.out.println(list);
	        
	        for(Integer element:list)
	        {
	            if(element%2==0)
	            {
	                evenList.add(element);
	            }
	        }
	        
	        
	        for(int i=0;i<list.size();i++)
	        {
	            if(list.get(i)%2==0)
	            {
	            
	                list.remove(i);
	            }
	        }
	        
	        Iterator<Integer> itr=list.iterator();
			
			while(itr.hasNext())
			{
				int element=itr.next();
				if(element%2==0)
				{
					evenList.remove(new Integer(element));
				}
			}
			
			
			
			list.removeAll(evenList);
			System.out.println(list);

	        list.removeAll(evenList);
	        System.out.println(list);
	    }

	}
