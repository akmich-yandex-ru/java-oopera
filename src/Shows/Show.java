package Shows;

import java.util.ArrayList;
import Persons.Actor;
import Persons.Director;

public class Show {
    protected String title;
    protected int duration;
    protected Director director;
    protected ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = new ArrayList<>();

        director.numberOfShows++;
    }

    public void printAllActors() {
        System.out.println("Актеры: ");
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
        }
    }

    public void printDirector() {
        System.out.println("режиссер " + director.toString());
    }

    public void addActor(Actor newActor) {
        if (listOfActors.contains(newActor)) {
            System.out.println("Такой актер уже есть");
            return;
        }

        listOfActors.add(newActor);
        System.out.println("Актер " + newActor.toString() + " успешно добавлен");
    }

    public void replaceActor(Actor newActor, String surnameOfReplacingActor) {
        int indexToReplace = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            if (listOfActors.get(i).getSurname().equals(surnameOfReplacingActor)) {
                indexToReplace = i;
                break;
            }
        }

        if (indexToReplace == -1) {
            System.out.println("Актера с фамилией " + surnameOfReplacingActor + " нет в списке");
        } else {
            listOfActors.set(indexToReplace, newActor);
            System.out.println("Актер с фамилией " + surnameOfReplacingActor + " успешно заменен на " + newActor.toString());
        }
    }

    @Override
    public String toString() {
        return "Спектакль " +
                "'" + title + '\'' +
                " (продолжительность " + duration + " минут)";
    }
}
