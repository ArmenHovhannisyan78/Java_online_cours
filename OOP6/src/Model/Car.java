package Model;
// JavaBeen
public class Car {
    private String model;
    private double engine;

    public double getEngine() {
        return engine;
    }

    public void setEngine(double e) {
        if (e > 0)
            engine = e;
        else System.out.println("Error!!! Your number is negative!!!");
    }

    private int year;

    public void printCareInfo() {
        System.out.println(model + " " + engine + " " + year);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
