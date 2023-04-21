package oop.lab08.ex4p1;

import java.util.*;
import java.util.ArrayList;

public class ComparableTest {
    public static void main(String[] args) {
        List<Movie> list = new ArrayList<>();
        list.add(new Movie("Force Awakens", 8.3, 2015));
        list.add(new Movie("Star Wars", 8.7, 1977));
        list.add(new Movie("Empire Strikes Back", 8.8, 1980));
        list.add(new Movie("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movie after sorting: ");
        for (Movie movie : list) {
            System.out.println(movie.getName() + " " +
                                movie.getRating() + " " +
                                movie.getYear());
        }
    }
}
