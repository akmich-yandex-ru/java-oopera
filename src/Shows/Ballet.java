package Shows;

import Persons.Choreographer;
import Persons.Director;
import Persons.MusicAuthor;

public class Ballet extends MusicalShow {
    private final Choreographer choreographer;

    public Ballet(String title, int duration, Director director, MusicAuthor musicAuthor, String librettoText, Choreographer choreographer) {
        super(title, duration, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Балет " +
                "'" + title + '\'' +
                " (продолжительность " + duration + " минут," +
                " автор музыки " + musicAuthor.toString() + "," +
                " хореограф " + choreographer.toString() + ")";
    }
}
