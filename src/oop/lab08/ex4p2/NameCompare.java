package oop.lab08.ex4p2;

import java.util.Comparator;
public class NameCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        return left.name.compareTo(right.name);
    }
}
