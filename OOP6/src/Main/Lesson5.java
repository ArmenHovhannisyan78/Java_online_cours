package Main;

import Model.Human;
import Model.Car;

public class Lesson5 {
    public static void main(String[] args) {
        Human human1 = new Human();
        human1.firstName = "Aram";
        human1.lastName = "Armyan";
        human1.gender = 'm';
        human1.isArmenian = true;
        human1.year = 2000;

        Human human2 = new Human();
        human2.firstName = "Anna";
        human2.lastName = "Grigoryan";
        human2.gender = 'f';
        human2.isArmenian = true;
        human2.year = 2003;

        Human h = new Human();
        h.firstName = "Ani";

        System.out.println(human1.firstName + " " + human1.lastName);

        if (human1.year < human2.year)
            System.out.println(human1.firstName);
        else
            System.out.println(human2.firstName);
        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName);

        Car car1 = new Car();
        car1.setModel("BMW");
        car1.setYear(2020);
        car1.setEngine(5.6);
        System.out.println(car1.getEngine());

        human1.sayHello();
        //  System.out.println(human1.firstName + " " + human1.lastName + ", " + human1.year + " year");
        human1.print();
        human2.print();
        h.print();
        car1.printCareInfo();
        String s = human2.fullName();
        System.out.println("Fool name of human2 is " + "'" + s + "'");

        human1.sum(4, 8);

        human1.print1toN(10);
        human2.print1toN(15);

        Car car2 = new Car();
        car2.setEngine(8.8);
        System.out.println(car2.getEngine());

        car1.setModel("Jeep");
        car1.setYear(2002);
        car1.setEngine(8.6);
        System.out.println(car1.getModel() + ", " + car1.getYear() + ", " + car1.getEngine() + ".");

        String text = "Hello every one";
        System.out.println(text.length());
        System.out.println(text.charAt(0));
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.charAt(i));
        }

        int countOfE = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'e')
            countOfE++;
        }
        System.out.println("there is a " + countOfE + " 'e' elements");
        System.out.println(text.toUpperCase());
    }
}
