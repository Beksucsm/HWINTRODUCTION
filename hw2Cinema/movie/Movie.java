package com.beksucsm.collections.hw2Cinema.movie;


import java.util.Objects;

/**
 * 1. Даны 2 класса:
 * - Фильм с 5-ю полями: Уникальный Целочисленный идентификатор (id),
 * Год издания, Месяц издания, Жанр и Рейтинг;
 */

public class Movie {

    private int id;
    private int year;
    private Month month;
    private Genre genre;
    private double rating;

    public Movie(int id, int year, Month month, Genre genre, double rating) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.genre = genre;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public Month getMonth() {
        return month;
    }

    public Genre getGenre() {
        return genre;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id == movie.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", year=" + year +
                ", month=" + month +
                ", genre=" + genre +
                ", rating=" + rating +
                '}';
    }
}
