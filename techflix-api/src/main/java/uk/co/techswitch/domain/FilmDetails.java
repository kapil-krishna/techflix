package uk.co.techswitch.domain;

import java.util.List;

public class FilmDetails extends Film {
    private List<Person> cast;

    public FilmDetails() { }

    public FilmDetails(String id,
                       String title,
                       String summary,
                       String releaseDate,
                       String bannerImage,
                       String posterImage,
                       String video,
                       List<Person> cast) {
        super(id, title, summary, releaseDate, bannerImage, posterImage, video);
        this.cast = cast;
    }

    public List<Person> getCast() {
        return cast;
    }
}
