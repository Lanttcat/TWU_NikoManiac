package main.model;

import java.util.LinkedHashSet;

/**
 * @program: Biblioteca_cmd
 * @description: book storage
 * @author: NikoLan
 * @create: 2018-07-19 18
 */
public class MovieSet {
    private  LinkedHashSet movies = new LinkedHashSet();

    public LinkedHashSet getMovies() {
        return movies;
    }

    public MovieSet() {
        movies.add(new Movie("testMovie1", 12111,"lan", 0, "2018", 9));
        movies.add(new Movie("testMovie2", 12112,"lan", 0, "2018", 3));
        movies.add(new Movie("testMovie3", 12113,"lan", 0, "2018", 6));
        movies.add(new Movie("testMovie4", 12114,"lan", 0, "2018", 8));
        movies.add(new Movie("testMovie5", 12115,"lan", 0, "2018", 7));
    }
}

