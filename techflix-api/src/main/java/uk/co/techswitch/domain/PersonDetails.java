package uk.co.techswitch.domain;

import java.util.List;

public class PersonDetails extends Person {
    private List<Film> films;

    public PersonDetails() { }

    public PersonDetails(String id, String name, String bannerImage, String posterImage, List<Film> films) {
        super(id, name, bannerImage, posterImage);
        this.films = films;
    }

    public List<Film> getFilms() {
        return films;
    }
}
