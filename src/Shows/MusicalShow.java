package Shows;

import Persons.Director;
import Persons.MusicAuthor;

class MusicalShow extends Show {
    public final MusicAuthor musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText) {
        super(title, duration, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }


    public void printLibrettoText() {
        System.out.println("Либретто: " + librettoText);
    }
}
