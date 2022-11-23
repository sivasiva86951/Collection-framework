package org.collection.test;

public class Book implements Comparable<Book> {

    
    int id;
    String name;
    double price;
    

    public Book(int id, String name, double price) {
        super();
        this.id = id;
        this.name = name;
        this.price = price;
    }


        @Override
        public int compareTo(Book book) {
        if(this.price==book.price)
        {
            return 0;
        }
        else if(this.price>book.price)
        {
            return 1;
        }
        else
        {
            return -1;
        }
    }
    
    

}