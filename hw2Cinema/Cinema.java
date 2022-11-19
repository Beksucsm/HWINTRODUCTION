package com.beksucsm.collections.hw2Cinema;

import com.beksucsm.collections.hw2Cinema.movie.*;
import com.beksucsm.collections.hw2Cinema.movie.comparator.MovieIdComparator;
import com.beksucsm.collections.hw2Cinema.movie.comparator.RatingComparator;

import java.util.*;


public class Cinema {

    private final Map<Integer, Set<Movie>> movieMap = new TreeMap<>();

    public void addMovie(Movie movie) {
        Set<Movie> set = movieMap.getOrDefault(movie.getYear(), new LinkedHashSet<>());
        set.add(movie);
        movieMap.put(movie.getYear(), set);
    }

    public Set<Movie> getMoviesByYear(int year) {
        Set<Movie> result = new LinkedHashSet<>();
        for (Map.Entry<Integer, Set<Movie>> entry : movieMap.entrySet()) {
            if (entry.getKey() == year) {
                result = entry.getValue();
            }
        }
        return result;
    }

    public Set<Movie> getMoviesByYearAndMonth(int year, Month month) {
        Set<Movie> result = new LinkedHashSet<>();
        for (Map.Entry<Integer, Set<Movie>> entry : movieMap.entrySet()) {
            if (entry.getKey() == year) {
                for (Movie movie : entry.getValue()) {
                    if (movie.getMonth() == month) {
                        result.add(movie);
                    }
                }
            }
        }
        return result;
    }

    public Set<Movie> getMoviesByGenre(Genre genre) {
        Set<Movie> result = new LinkedHashSet<>();
        for (Set<Movie> list : movieMap.values()) {
            for (Movie movie : list) {
                if (movie.getGenre() == genre) {
                    result.add(movie);
                }
            }
        }
        return result;
    }

    public Set<Movie> getTopTen() {
        //        Без дополнительного компаратора,если рейтинги фильмов были одинаковые
        //в список не добавлялся фильм,исправил через айди компаратор,но мб можно было получше оптимиизровать
        Set<Movie> movieSet = new TreeSet<>(new RatingComparator().thenComparing(new MovieIdComparator()));
        Set<Movie> result = new TreeSet<>(new RatingComparator().thenComparing(new MovieIdComparator()));
        for (Set<Movie> list : movieMap.values()) {
            movieSet.addAll(list);
        }
        for (Movie nextMovie : movieSet) {
            if (result.size() < 10) {
                result.add(nextMovie);
            }
        }
        //output
        for (Movie movie : result) {
            System.out.println(movie);
        }
        return result;
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movieMap=" + movieMap +
                '}';
    }
}
