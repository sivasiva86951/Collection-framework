package org.collection.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafeExample {
	
	public static void main(String args[])
	{
		CopyOnWriteArrayList<Integer> list=new CopyOnWriteArrayList<>(new Integer[] {1,2,3,5,6});
		
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

