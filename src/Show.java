import java.util.ArrayList;

public class Show {
    String title;
    double duration;
    Director director;
    ArrayList<Actor> listOfActors = new ArrayList<Actor>();

    public Show(String title, double duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }

    public void printInfo() {
        for (Actor actor : listOfActors) {
            System.out.println(actor);
        }

    }


    public void addActor(Actor actor) {
        for (Actor actor1 : listOfActors) {
            if (actor1.equals(actor)) {
                System.out.println("Такой актер уже есть в спектакле!");
                return;
            }
        }

        listOfActors.add(actor);
    }


    public void setActor(Actor actor, String surname) {
        for (int i = 0; i < listOfActors.size(); i++) {
            if (surname.equals(listOfActors.get(i).getSurname())) {
                listOfActors.set(i, actor);
                return;
            }
        }

        System.out.println("Актера с такой фамилией нет в базе.");
    }

}
