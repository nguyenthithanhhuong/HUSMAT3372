package oop.lab08.ex4p2;

import java.util.Comparator;

public class RatingCompare implements Comparator<Movie> {
    @Override
    public int compare(Movie left, Movie right) {
        if (Double.compare(left.rating, right.rating) == 0) {
            return 0;
        } else if (Double.compare(left.rating, right.rating) > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}