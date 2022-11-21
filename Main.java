public class Main {
    public static void main(String[] args) {

        //        doHw1Task1();
//       doHw1Task2();
//        doHw2Task1();
//        doHw3Task1();
//        doHw1EncapsulationTask1();
        doHw1EncapsulationTask2();
    }

//    public static void doHw1Task1() {
//        //        ДЗ 1 Задание 1
//        Human maxim = new Human();
//
//        maxim.name = "Максим";
//        maxim.town = "Минск";
//        maxim.yearOfBirth = 1988;
//
//        maxim.greet();
//
//        Human anya = new Human();
//
//        anya.name = "Аня";
//        anya.town = "Москва";
//        anya.yearOfBirth = 1993;
//
//        anya.greet();
//
//        Human katya = new Human();
//
//        katya.name = "Катя";
//        katya.town = "Калининград";
//        katya.yearOfBirth = 1992;
//
//        katya.greet();
//
//        Human artem = new Human();
//
//        artem.name = "Артем";
//        artem.town = "Москва";
//        artem.yearOfBirth = 1995;
//
//        artem.greet();
//
//    }

//    public static void doHw1Task2() {
//        //        ДЗ 1 Задание 2
//        Human maxim = new Human();
//
//        maxim.name = "Максим";
//        maxim.town = "Минск";
//        maxim.yearOfBirth = 1988;
//        maxim.jobTitle = "бренд-менеджер";
//        maxim.greetWithJob();
//
//        Human anya = new Human();
//
//        anya.name = "Аня";
//        anya.town = "Москва";
//        anya.yearOfBirth = 1993;
//        anya.jobTitle = "методист образовательных программ";
//        anya.greetWithJob();
//
//        Human katya = new Human();
//
//        katya.name = "Катя";
//        katya.town = "Калининград";
//        katya.yearOfBirth = 1992;
//        katya.jobTitle = "продакт-менеджер";
//        katya.greetWithJob();
//
//        Human artem = new Human();
//
//        artem.name = "Артем";
//        artem.town = "Москва";
//        artem.yearOfBirth = 1995;
//        artem.jobTitle = "директор по развитию бизнеса";
//        artem.greetWithJob();
//
//
//    }


    //        ДЗ 2 Задание 1
    public static void doHw2Task1() {

        System.out.println("Домашнее задание 2 Задача 1");

        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
        Human anya = new Human(1993, "Аня", "Москва", "методист образовательных программ");
        Human katya = new Human(1992, "Катя", "Калининград", "продакт-менеджер");
        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");


        maxim.greetWithJob();
        anya.greetWithJob();
        katya.greetWithJob();
        artem.greetWithJob();

    }

    //        ДЗ 3 Задание 1
//    public static void doHw3Task1() {
//
//        System.out.println("Домашнее задание 3 Задача 1");
//
//        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
//        Human anya = new Human(1993);
//        Human katya = new Human(-1992, "Катя", " ", "продакт-менеджер");
//        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
//
//
//        maxim.setYearOfBirth(-2000);
//        maxim.setTown(null);
//        maxim.greetWithJob();
//        anya.greetWithJob();
//        katya.greetWithJob();
//        artem.greetWithJob();
//        vladimir.greetWithJob();
//
//    }
    //        ДЗ 1. Инкапсуляция. Задание 1
//    public static void doHw1EncapsulationTask1() {
//
//        System.out.println("Домашнее задание 1 Инкапсуляция Задача 1");
//
//        Human maxim = new Human(1988, "Максим", "Минск", "бренд-менеджер");
//        Human anya = new Human(1993, "Москва");
//        Human katya = new Human(-1992, "Катя", " ", "продакт-менеджер");
//        Human artem = new Human(1995, "Артем", "Москва", "директор по развитию бизнеса");
//        Human vladimir = new Human(2001, "Владимир", "Казань", "сейчас нигде не работаю");
//
//        maxim.setYearOfBirth(-2000);
//        maxim.setTown(null);
//        maxim.greetWithJob();
//        anya.greetWithJob();
//        katya.greetWithJob();
//        artem.greetWithJob();
//        vladimir.greetWithJob();
//
//    }

    public static void doHw1EncapsulationTask2() {
        System.out.println("ДЗ 1. Инкапсуляция. Задание 2");

        Flower rose = new Flower("Роза обыкновенная", " ", "Голландия", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", "желтый", "", 15, 5);
        Flower pion = new Flower("Пион", "красный ", "Англия", 69.9, 1);
        Flower gypsophila = new Flower("Гипсофила", " ", "Турция", 19.5, 10);

        rose.setCost(-40.235);
        pion.setFlowerName(null);
        rose.printAllInfoAboutFlowers();
        chrysanthemum.printAllInfoAboutFlowers();
        pion.printAllInfoAboutFlowers();
        gypsophila.printAllInfoAboutFlowers();

    }
}

