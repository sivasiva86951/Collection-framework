package org.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BookMain {

    public static void main(String[] args) {
        
        List<Book> bookList=new ArrayList<>();
        
        bookList.add(new Book(78,"Novel",3000));
        bookList.add(new Book(56,"Short story",1000));
        bookList.add(new Book(33,"Literature",4000));
        
        
           for(Book book:bookList)
           {
               System.out.println(book.id+ " "+book.name+ " "+book.price);
           }
        
        Collections.sort(bookList);
        
        System.out.println("========================================");
       for(Book book:bookList)
       {
           System.out.println(book.id+ " "+book.name+ " "+book.price);
       }
    }
}