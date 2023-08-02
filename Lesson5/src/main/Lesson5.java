package main;

import model.Human;
import model.Car;

public class Lesson5 {
    public static void main(String[] args) {

        Human human1 = new Human();
        human1.firstName = "Aram";
        human1.lastName = "Adamyan";
        human1.gender = 'm';
        human1.isArmenian = true;
        human1.year = 2000;

        Human human2 = new Human();
        human2.firstName = "Anna";
        human2.lastName = "Hakobyan";
        human2.gender = 'f';
        human2.isArmenian = true;
        human2.year = 2003;
        System.out.println(human1.firstName + " " + human1.lastName);

        if (human1.year > human2.year)
            System.out.println(human1.firstName);
        else
            System.out.println(human2.firstName);

        System.out.println(human1.year < human2.year ? human1.firstName : human2.firstName);

        Car car1 = new Car();
        car1.model = "Lada 2110";
        car1.set_engine(1.6);
        car1.year = 2001;
        System.out.println(car1.model + " " + car1.get_engine());

        human1.printFullName();
        human2.printFullName();
        car1.careFullElements();

        String s = human1.fullName();
        System.out.println("Full name of human1 is " + s);

        human1.sum(4, 10);
        human2.print1toN(15);

        Car car2 = new Car();
        car2.set_engine(2.8);
        System.out.println(car2.get_engine());
    }
}
