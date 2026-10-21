import java.util.ArrayList;

class Theatre{
    public static void main(String[] args){

        String musicAuthor = "Чайковский";
        String choreographer = "Антонов";

        Actor actor1 = new Actor("Катя", "Иванова", 167, Gender.FEMALE);
        Actor actor2 = new Actor("Саня", "Куликов", 187, Gender.MALE);
        Actor actor3 = new Actor("Ваня", "Комаров", 178, Gender.MALE);

        Director director1 = new Director("Олег", "Достоевский",  Gender.MALE, 13);
        Director director2 = new Director("Владимир", "Птушкин", Gender.MALE, 23);

        Show spektakl = new Show("Война и мир", 145, director1, new ArrayList<>());
        Opera opera = new Opera("Травиата", 100, director1, new ArrayList<>(),  musicAuthor,
                "Lalalala", 10);
        Ballet ballet = new Ballet("Щелкунчик", 89, director2, new ArrayList<>(),  musicAuthor,
                "ддддадададададад" ,choreographer);
        spektakl.addActor(actor1);
        spektakl.addActor(actor2);
        spektakl.addActor(actor3);
        opera.addActor(actor1);
        opera.addActor(actor2);

        ballet.addActor(actor1);
        ballet.addActor(actor2);
        ballet.addActor(actor3);


        System.out.println("Обычный спектакль:");
        spektakl.printInfo();

        System.out.println("Опера:");
        opera.printInfo();

        System.out.println("Балет:");
        ballet.printInfo();


        System.out.println("После замены:");
        opera.setActor(actor3, "Иванова");
        opera.printInfo();


        System.out.println("Проверка несуществующего актера:");
        ballet.setActor(actor2, "Несуществующий");


        System.out.println("Либретто оперы:");
        opera.printLibrettoText();

        System.out.println("Либретто балета:");
        ballet.printLibrettoText();

        System.out.println("Режиссёр спектакля:");
        System.out.println(director1);

        System.out.println("Режиссёр балета:");
        System.out.println(director2);
    }
}