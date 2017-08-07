package com.example.user.movierankings;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class RankingsTest {

    Rankings rankings;
    Movie movie1;
    Movie movie2;
    Movie movie3;
    Movie movie4;
    Movie movie5;
    Movie movie6;
    Movie movie7;
    Movie movie8;
    Movie movie9;
    Movie movie10;
    Movie movie11;





    @Before
    public void before() {
        rankings = new Rankings();
        movie1 = new Movie("Old Boy", "Thriller", 1);
        movie2 = new Movie("Toy Story", "Family", 2);
        movie3 = new Movie("Die Hard", "Action", 3);
        movie4 = new Movie("Barry Trotter", "Fantasy", 4);
        movie5 = new Movie("Fast 5", "Action", 5);
        movie6 = new Movie("Die Hard 2", "Action", 6);
        movie7 = new Movie("Toy Story 2", "Family", 7);
        movie8 = new Movie("Interstellar", "Drama", 8);
        movie9 = new Movie("Dunkirk", "Drama", 9);
        movie10 = new Movie("Inception", "Thriller", 10);
        movie11 = new Movie("Deception", "Comedy", 10);
    }

    @Test
    public void rankingsStartsEmpty() {
        assertEquals(0, rankings.rankCount());
    }

    @Test
    public void canAddMovie() {
        rankings.addMovie(movie1);
        assertEquals(1, rankings.rankCount());
    }

    @Test
    public void getMovieByRanking() {
        rankings.addMovie(movie1);
        Movie movie = rankings.getMovie(1);
        assertEquals("Old Boy", movie.getTitle());
    }

    @Test
    public void canReplaceLastMovie() {
        rankings.addMovie(movie1);
        rankings.addMovie(movie2);
        rankings.addMovie(movie3);
        rankings.addMovie(movie4);
        rankings.addMovie(movie5);
        rankings.addMovie(movie6);
        rankings.addMovie(movie7);
        rankings.addMovie(movie8);
        rankings.addMovie(movie9);
        rankings.addMovie(movie10);

        rankings.replaceLast(movie11);
        Movie movie = rankings.getMovie(10);
        assertEquals("Deception", movie.getTitle());

    }

}
