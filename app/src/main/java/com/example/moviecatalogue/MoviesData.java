package com.example.moviecatalogue;

import java.util.ArrayList;

public class MoviesData {
    private static String[] moviesTitles = {
            "Joker (2019)",
            "Elysium (2013)",
            "Spider-Man: Far from Home (2019)",
            "Forrest Gump (1994)",
            "Inception (2010)",
            "Léon: The Professional (1994)",
            "WALL·E (2008)",
            "Up (2009)",
            "Shutter Island (2010)",
            "Rounders (1998)",
            "Once Upon a Time... in Hollywood (2019)"
    };

    private static int[] moviesPoster = {
            R.drawable.joker,
            R.drawable.elysium,
            R.drawable.spiderman,
            R.drawable.forrest_grump,
            R.drawable.inception,
            R.drawable.leon,
            R.drawable.wall_e,
            R.drawable.up,
            R.drawable.shutter_island,
            R.drawable.rounders,
            R.drawable.once_upon_a_time_in_hollywood
    };

    private static String[] moviesDetail = {
            "An original standalone origin story of the iconic villain not seen before on the big screen, it's a gritty character study of Arthur Fleck, a man disregarded by society, and a broader cautionary tale.",
            "In the year 2154, the very wealthy live on a man-made space station while the rest of the population resides on a ruined Earth. A man takes on a mission that could bring equality to the polarized worlds.",
            "Following the events of Avengers: Endgame (2019), Spider-Man must step up to take on new threats in a world that has changed forever.",
            "The presidencies of Kennedy and Johnson, the events of Vietnam, Watergate, and other history unfold through the perspective of an Alabama man with an IQ of 75.",
            "A thief who steals corporate secrets through the use of dream-sharing technology is given the inverse task of planting an idea into the mind of a C.E.O.",
            "Mathilda, a 12-year-old girl, is reluctantly taken in by Léon, a professional assassin, after her family is murdered. Léon and Mathilda form an unusual relationship, as she becomes his protégée and learns the assassin's trade.",
            "In the distant future, a small waste-collecting robot inadvertently embarks on a space journey that will ultimately decide the fate of mankind.",
            "Seventy-eight year old Carl Fredricksen travels to Paradise Falls in his home equipped with balloons, inadvertently taking a young stowaway.",
            "In 1954, a U.S. Marshal investigates the disappearance of a murderer, who escaped from a hospital for the criminally insane.",
            "A young, reformed gambler must return to playing big stakes poker to help a friend pay off loan sharks, while balancing his relationship with his girlfriend and his commitments to law school.",
            "A faded television actor and his stunt double strive to achieve fame and success in the film industry during the final years of Hollywood's Golden Age in 1969 Los Angeles."
    };

    private static String[] moviesDirector = {
            "Todd Phillips",
            "Neill Blomkamp",
            "Jon Watts",
            "Robert Zemeckis",
            "Christopher Nolan",
            "Luc Besson",
            "Andrew Stanton",
            "Pete Docter, Bob Peterson (co-director)",
            "Martin Scorsese",
            "John Dahl",
            "Quentin Tarantino"
    };

    private static String[] moviesWriters = {
            "Todd Phillips (screenplay), Scott Silver (screenplay)",
            "Neill Blomkamp",
            "Chris McKenna, Erik Sommers | 2 more credits",
            "Winston Groom (novel), Eric Roth (screenplay)",
            "Christopher Nolan",
            "Luc Besson",
            "Andrew Stanton (original story by), Pete Docter (original story by) | 2 more credits",
            "Pete Docter (story by), Bob Peterson (story by) | 3 more credits",
            "Laeta Kalogridis (screenplay), Dennis Lehane (novel)",
            "David Levien, Brian Koppelman",
            "Quentin Tarantino"
    };

    private static String[] moviesStars = {
            "Robert De Niro, Joaquin Phoenix, Marc Maron",
            "Matt Damon, Jodie Foster, Sharlto Copley",
            "Tom Holland, Samuel L. Jackson, Jake Gyllenhaal",
            "Tom Hanks, Robin Wright, Gary Sinise",
            "Leonardo DiCaprio, Joseph Gordon-Levitt, Ellen",
            "Jean Reno, Gary Oldman, Natalie Portman",
            "Ben Burtt, Elissa Knight, Jeff Garlin",
            "Edward Asner, Jordan Nagai, John Ratzenberger",
            "Leonardo DiCaprio, Emily Mortimer, Mark Ruffalo",
            "Matt Damon, Edward Norton, Gretchen Mol",
            "Leonardo DiCaprio, Brad Pitt, Margot Robbie"
    };

    static ArrayList<Movies> getListData() {
        ArrayList<Movies> list = new ArrayList<>();
        for (int i = 0; i < moviesTitles.length; i++) {
            Movies movie = new Movies();
            movie.setTitle(moviesTitles[i]);
            movie.setDetail(moviesDetail[i]);
            movie.setDirector(moviesDirector[i]);
            movie.setWriters(moviesWriters[i]);
            movie.setStars(moviesStars[i]);
            movie.setPoster(moviesPoster[i]);
            list.add(movie);
        }
        return list;
    }
}
