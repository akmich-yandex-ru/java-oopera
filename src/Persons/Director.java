package Persons;

public class Director extends Person {
    public int numberOfShows;

    public Director(String name, String surname, Gender gender) {
        super(name, surname, gender);
    }

    @Override
    public String toString() {
        return name + " " + surname;
    }
}
