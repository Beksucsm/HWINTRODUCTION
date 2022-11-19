package com.beksucsm.collections.hw2Cinema;


import com.beksucsm.collections.hw2Cinema.movie.Genre;
import com.beksucsm.collections.hw2Cinema.movie.Month;
import com.beksucsm.collections.hw2Cinema.movie.Movie;

public class CinemaParkRunner {

    public static void main(String[] args) {

        Cinema cinemaPark = new Cinema();
        cinemaPark.addMovie(new Movie(1, 2010, Month.NOVEMBER, Genre.THRILLER, 6.7));
        cinemaPark.addMovie(new Movie(1, 2010, Month.NOVEMBER, Genre.THRILLER, 6.7));
        cinemaPark.addMovie(new Movie(2, 1999, Month.NOVEMBER, Genre.DRAMA, 9.0));
        cinemaPark.addMovie(new Movie(6, 1998, Month.JUNE, Genre.THRILLER, 7.5));
        cinemaPark.addMovie(new Movie(5, 2022, Month.SEPTEMBER, Genre.ADVENTURE, 7.5));
        cinemaPark.addMovie(new Movie(4, 2022, Month.AUGUST, Genre.ADVENTURE, 2.4));
        cinemaPark.addMovie(new Movie(7, 2011, Month.JANUARY, Genre.THRILLER, 7.7));
        cinemaPark.addMovie(new Movie(8, 2015, Month.SEPTEMBER, Genre.THRILLER, 7.7));
        cinemaPark.addMovie(new Movie(9, 2004, Month.JULY, Genre.THRILLER, 6.6));
        cinemaPark.addMovie(new Movie(10, 2002, Month.MAY, Genre.THRILLER, 9.9));
        cinemaPark.addMovie(new Movie(11, 2023, Month.MARCH, Genre.THRILLER, 4.0));
        cinemaPark.addMovie(new Movie(15, 2023, Month.MARCH, Genre.THRILLER, 1.1));
        cinemaPark.addMovie(new Movie(17, 2023, Month.MARCH, Genre.THRILLER, 0.5));

        System.out.println(cinemaPark);
        System.out.println("Movies by Year:");
        System.out.println(cinemaPark.getMoviesByYear(2023));
        System.out.println("By year and month:");
        System.out.println(cinemaPark.getMoviesByYearAndMonth(1999,Month.NOVEMBER));
        System.out.println("By Genre");
//        Genre sorted by year;
        System.out.println(cinemaPark.getMoviesByGenre(Genre.THRILLER));
        System.out.println("TOP TEN:");
        cinemaPark.getTopTen();

    }
}
