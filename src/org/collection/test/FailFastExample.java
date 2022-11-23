package org.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;


public class FailFastExample {


	public static void main(String args[])
	{
		ArrayList<Integer> list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
		
		Iterator<Integer> itr=list.iterator();
		
		
		while(itr.hasNext())
		{
			Integer a=itr.next();
			System.out.println(a);
			
			
			 if(a==3)
			 { 
				 list.add(7); 
				 }
			 
		}
	}

}

