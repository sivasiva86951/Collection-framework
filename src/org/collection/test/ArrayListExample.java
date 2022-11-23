package org.collection.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

class Employee
{
    int id;
    String name;
    
    public Employee(int id, String name) {
        
        this.id = id;
        this.name = name;
    }
    
    
}

public class ArrayListExample {

    public static void main(String[] args) {
    
        List<Integer> numbers=new ArrayList<>();
        
        ArrayList<Integer> values=new ArrayList<>();
        
        
        ArrayList<String> colors=new ArrayList<>();
        
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(new Employee(123, "Naman"));
        employees.add(new Employee(145, "Suman"));
        
        
        System.out.println(employees);
        
        
        
        
        numbers.add(123); //0th index
        numbers.add(124);
        numbers.add(125);
        numbers.add(126);
        numbers.add(127);
        numbers.add(128);
        numbers.add(123); //6th index
        
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);
        values.add(5);
        values.add(6);
        
        colors.add("red");
        colors.add("green");
        colors.add("yellow");
        colors.add("purple");
        
        System.out.println(numbers);
        System.out.println(values);
        System.out.println(colors);
        
        for(Employee e:employees)  //advanced forloop
        {
            System.out.println(e.id +" "+ e.name);
        }
        
        employees.forEach(e ->System.out.println(e.id +" "+ e.name) );//foreach
        
        //iterator
        Iterator<Integer> iterator=numbers.iterator();
        while(iterator.hasNext())
        {
            System.out.print(iterator.next() +" ");
        }
        
        
        ArrayList list=new ArrayList<>();
        System.out.println("\n"+numbers.size());
        System.out.println(list.contains("abc"));
        System.out.println(list.indexOf("abc"));
        System.out.println(numbers.lastIndexOf(123));
        System.out.println(numbers.remove(5));
        Integer i=new Integer(128);
        System.out.println(numbers.remove(i));
        System.out.println(numbers.addAll(values));
        System.out.println(numbers);
        
        System.out.println(numbers.removeAll(Arrays.asList(2,3,4)));
        System.out.println(numbers);
    }

}

