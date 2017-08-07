package com.example.user.movierankings;

/**
 * Created by user on 07/08/2017.
 */

public class Rankings {

    private Movie[] rankingsList;

    public Rankings() {
        this.rankingsList = new Movie[10];
    }


    public int rankCount() {
        int count = 0;

        for(Movie movie : this.rankingsList ){

            if(movie != null){
                count++;
            }

        }
        return count;
    }

    public void addMovie(Movie newMovie) {
        rankingsList[newMovie.getRanking() - 1] = newMovie;
    }

    public Movie getMovie(int ranking) {
        return rankingsList[ranking - 1];
    }

    public void replaceLast(Movie newMovie) {
        rankingsList[9] = newMovie;
    }
}
