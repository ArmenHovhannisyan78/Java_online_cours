package model;

public class Car {
    public String model;
    private double engine;
    public int year;

    public void careFullElements() {
        System.out.println(model + ", " + engine + ", " + year);
    }

    public double get_engine() {
        return engine;
    }

    public void set_engine(double e) {
        if (e < 0)
            System.out.println("Error minus number!!!  " + e);
        else
            engine = e;


}

}
