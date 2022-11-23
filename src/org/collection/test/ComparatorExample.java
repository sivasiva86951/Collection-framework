package org.collection.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>
{
    private double rating;
    private String name;
    private int year;
    
    public Movie(double rating, String name, int year) {
        super();
        this.rating = rating;
        this.name = name;
        this.year = year;
    }

    @Override
    public int compareTo(Movie o) 
    {
        
        return this.year - o.year;
    }

    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }
    
}


class RatingCompare implements Comparator<Movie>
{

    @Override
    public int compare(Movie o1, Movie o2) {
        if(o1.getRating() > o2.getRating())
        {
            return 1;
        }
        if(o1.getRating()<o2.getRating())
        {
            return -1;
        }
        else
        {
            return 0;
        }
    }
    
}

class NameCompare implements Comparator<Movie>
{

    @Override
    public int compare(Movie o1, Movie o2) {
        return o1.getName().compareTo(o2.getName()); // Z - B  90>66 - 24
    }
    
}
public class ComparatorExample {

    public static void main(String[] args) {
        
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie(9.0,"H",2012));
        movies.add(new Movie(4.0,"L",2019));
        movies.add(new Movie(8.0,"B",2001));
        movies.add(new Movie(7.0,"T",2005));
        
        
        for(Movie movie:movies)
        {
            System.out.println(movie.getName()+ " "+movie.getRating()+" "+movie.getYear());
        }
        
        System.out.println("sorting on movie released Year:");
        Collections.sort(movies);
        
        for(Movie movie:movies)
        {
            System.out.println(movie.getName()+ " "+movie.getRating()+" "+movie.getYear());
        }
        
        
        
        System.out.println("sorting on movie Rating:");
        
        
        Collections.sort(movies,new RatingCompare());
        
        for(Movie movie:movies)
        {
            System.out.println(movie.getName()+ " "+movie.getRating()+" "+movie.getYear());
        }
        
        
        
        System.out.println("sorting on movie Name:");
        Collections.sort(movies,new NameCompare());
        for(Movie movie:movies)
        {
            System.out.println(movie.getName()+ " "+movie.getRating()+" "+movie.getYear());
        }
    }

}

