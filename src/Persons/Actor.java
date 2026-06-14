package Persons;

import java.util.Objects;

public class Actor extends Person {
    protected final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public String toString() {
        return name + " " + surname + " (рост " + height + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return super.equals(o) && (height == actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(height);
    }
}
