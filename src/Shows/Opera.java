package Shows;

import Persons.Director;
import Persons.MusicAuthor;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера " +
                "'" + title + '\'' +
                " (продолжительность " + duration + " минут"+
                " автор музыки " + musicAuthor.toString() + "," +
                " хор из " + choirSize + " человек)";
    }
}
