import Persons.*;
import Shows.Ballet;
import Shows.Opera;
import Shows.Show;

public class Theatre {

    public static void main(String[] args) {

        // 1. Создать трёх актеров и двух режиссёров.
        // Также создайте одного автора музыки и одного хореографа

        System.out.println("-".repeat(10) +
                " добавление актеров, режиссеров, автора музыки и хореографа " +
                "-".repeat(10));

        Actor actor1 = new Actor("Иван", "Иванов", Gender.MALE, 180);
        Actor actor2 = new Actor("Ирина", "Иванова", Gender.FEMALE, 160);
        Actor actor3 = new Actor("Сергей", "Сергеев", Gender.MALE, 175);

        Director director1 = new Director("Алексей", "Алексеев", Gender.MALE);
        Director director2 = new Director("Мария", "Мареева", Gender.FEMALE);

        MusicAuthor musicAuthor1 = new MusicAuthor("Василий", "Васильев", Gender.MALE);

        Choreographer choreographer1 = new Choreographer("София", "Софиева", Gender.FEMALE);

        // 2. Создать три спектакля: обычный, оперный и балет

        System.out.println("-".repeat(10) +
                " создание спектаклей: обычного, оперного и балета " +
                "-".repeat(10));

        String librettoText1 = "бла-бла-блаааа";
        String librettoText2 = "алб-алб-аааалб";

        Show show1 = new Show("Обычный спектакль", 100, director1);
        Opera opera1 = new Opera("Опера", 110,director1, musicAuthor1, librettoText1, 10);
        Ballet ballet1 = new Ballet("Балет", 120, director2, musicAuthor1, librettoText2, choreographer1);

        // 3. Распределить актёров по спектаклям.
        // Используйте для этого метод добавления нового актёра в спектакль.
        // Один актёр может участвовать в нескольких спектаклях.

        System.out.println("-".repeat(10) +
                " распределение актеров по спектаклям " +
                "-".repeat(10));

        show1.addActor(actor1);
        show1.addActor(actor2);

        opera1.addActor(actor3);
        opera1.addActor(actor2);

        ballet1.addActor(actor1);
        ballet1.addActor(actor3);

        // 4. Для каждого спектакля выведите на экран список актёров.

        System.out.println("-".repeat(10) +
                " вывод информации о спектаклях " +
                "-".repeat(10));

        System.out.println(show1);
        show1.printDirector();
        show1.printAllActors();

        System.out.println(".".repeat(30));

        System.out.println(opera1);
        opera1.printDirector();
        opera1.printAllActors();

        System.out.println(".".repeat(30));

        System.out.println(ballet1);
        ballet1.printDirector();
        ballet1.printAllActors();

        // 5. Замените актёра в одном из спектаклей на актёра из другого спектакля
        // и ещё раз выведите для него список актёров.

        System.out.println("-".repeat(10) +
                " замена существующего актера " +
                "-".repeat(10));

        show1.replaceActor(actor3, "Иванов");
        show1.printAllActors();

        // 6. Попробуйте заменить в другом спектакле несуществующего актёра

        System.out.println("-".repeat(10) +
                " замена несуществующего актера " +
                "-".repeat(10));

        ballet1.replaceActor(actor1, "Немо");

        // 7. Для оперного и балетного спектакля выведите на экран текст либретто.

        System.out.println("-".repeat(10) +
                " вывод текста либретто " +
                "-".repeat(10));

        System.out.println(opera1);
        opera1.printLibrettoText();

        System.out.println(".".repeat(30));

        System.out.println(ballet1);
        ballet1.printLibrettoText();

    }
}