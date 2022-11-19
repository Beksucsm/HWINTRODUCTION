package com.beksucsm.collections.hw2Cinema.movie.comparator;

import com.beksucsm.collections.hw2Cinema.movie.Movie;

import java.util.Comparator;

public class MovieIdComparator implements Comparator<Movie> {

    @Override
    public int compare(Movie o1, Movie o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
}
