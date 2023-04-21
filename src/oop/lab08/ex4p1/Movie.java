package oop.lab08.ex4p1;

import java.io.*;
import java.util.*;

public class Movie implements Comparable<Movie>{
    private String name;
    private double rating;
    private int year;

    @Override
    public int compareTo(Movie movie) {
        if (this.year == movie.getYear()) {
            return 0;
        } else if (this.year > movie.getYear()) {
            return 1;
        } else {
            return -1;
        }
    }

    public Movie(String name, double rating, int year) {
        this.name = name;
        this.rating = rating;
        this.year = year;
    }

    public double getRating() {
        return this.rating;
    }

    public String getName() {
        return this.name;
    }

    public int getYear() {
        return this.year;
    }
}
