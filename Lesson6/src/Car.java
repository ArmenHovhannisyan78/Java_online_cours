public class Car {
    private String number;
    private int year;

    public Car(String number, int year) {
        this.number = number;
        this.year = year;
    }

    public String getName() {
        return number;
    }

    public void setName(String name) {
        this.number = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
