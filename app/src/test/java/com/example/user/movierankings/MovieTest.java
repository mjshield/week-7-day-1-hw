package com.example.user.movierankings;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 07/08/2017.
 */

public class MovieTest {

    Movie movie;

    @Before
    public void before() {
        movie = new Movie("Old Boy", "Thriller", 1);
    }

    @Test
    public void canGetTitle() {
        assertEquals("Old Boy", movie.getTitle());
    }

    @Test
    public void canGetGenre() {
        assertEquals("Thriller", movie.getGenre());
    }

    @Test
    public void canGetRanking() {
        assertEquals(1, movie.getRanking());
    }

    @Test
    public void canSetTitle() {
        movie.setTitle("Young Boy");
        assertEquals("Young Boy", movie.getTitle());
    }

    @Test
    public void canSetGenre() {
        movie.setGenre("Comedy");
        assertEquals("Comedy", movie.getGenre());
    }

    @Test
    public void canSetRanking() {
        movie.setRanking(8);
        assertEquals(8, movie.getRanking());
    }

    @Test
    public void canGetToString() {
        assertEquals("Title: Old Boy\nGenre: Thriller\nRanking: 1", movie.toString());
    }

}
