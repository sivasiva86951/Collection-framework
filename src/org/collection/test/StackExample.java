package org.collection.test;


import java.util.Iterator;
import java.util.Stack;

public class StackExample {

    public static void main(String[] args) {
        
        
        Stack<Integer> stack=new Stack<>();
         stack.add(87);
         stack.add(88);
         stack.add(89);
         stack.add(90);
         
         System.out.println(stack);
        
         for(int i=0;i<stack.size();i++)
         {
             System.out.println(stack.get(i));
         }
         
         System.out.println(stack);
         
         System.out.println(stack.pop());
         System.out.println(stack);
         stack.push(99);
         
         System.out.println(stack);
         
        
         System.out.println(stack.peek());
         
         System.out.println(stack);
        System.out.println(stack.contains(45));
         
        
         System.out.println(stack.get(1));
         
         stack.forEach(cx->System.out.println(cx));
         
         System.out.println(stack.capacity());//10          new capacity=old capacity * 2
         stack.ensureCapacity(11);  //20
         System.out.println(stack.capacity());
         stack.ensureCapacity(21);  //40
         System.out.println(stack.capacity());
            }

}

