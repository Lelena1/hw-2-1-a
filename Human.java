public class Human {
    int yearOfBirth;
    String name;
    String town;
    String jobTitle;

//    //    ДЗ 1 Задание 1
//    void greet() {
//        System.out.println(toString());
//    }
//
//    //    ДЗ 1 Задание 2
//    void greetWithJob() {
//        System.out.println(toStringWithJob());
//    }

//    ДЗ 2 Задание 1


    //    Human(int yearOfBirth, String name, String town, String jobTitle) {
//        this.yearOfBirth = yearOfBirth;
//        this.name = name;
//        this.town = town;
//        this.jobTitle = jobTitle;
//    }
//      ДЗ 3 Задание 1
    Human(int yearOfBirth) {
        this(yearOfBirth, "Информация не указана", "Информация не указана", "Информация не указана");
    }

    Human(int yearOfBirth, String name, String town, String jobTitle) {
        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }
        this.name = name;
        this.town = town;
        this.jobTitle = jobTitle;
    }

    void greetWithJob() {
        System.out.println(toStringWithJob());
    }

    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Будем знакомы!";
    }

    public String toStringWithJob() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth +
                " году. Я работаю на должности " + jobTitle + ". Будем знакомы!";
    }
}
