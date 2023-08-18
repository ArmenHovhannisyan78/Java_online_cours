public class Main {
    public static void main(String[] args) {
        byte x = 4;
        int a = -127;
        x = (byte) a;
        System.out.println(x);

        x = (byte) (x + 1);
        System.out.println(x);
        x++;
        x += -7;
        System.out.println(x);

        x = 1;
        System.out.println("barev " + x + 5 + " Java");
        System.out.println("barev " + (x + 5) + " Java");

        String s = "7";
        int z = Integer.parseInt(s);
        System.out.println(1 + z);

        int k = 68;
        String zz = k + "";
        System.out.println(1 + zz);
        int b = Integer.parseInt(zz);
        System.out.println(1 + b);

        Student s1 = new Student();
        s1.setAge(44);
        s1.setName("Armen");
        System.out.println(s1.getName());

        Student s2 = new Student("Artavazd");
        //s2.setName("Artashes");
        System.out.println(s2.getName());

        Student s3 = new Student("Samuel", 12);
        System.out.println(s3.getName() + " " + s3.getAge() + " years old");
        Car car1 = new Car("37NT397", 2001);
        car1.setName("37NT497");
        System.out.println("Car number is - " + car1.getName() + "\nCar made year is - " + car1.getYear());

        s1.sum(4, 2);
        s2.sum(5, 8, 12);

        Teacher t1 = new Teacher();
        t1.setSalary(1000);
        t1.setName("Sahakyan");
        t1.setPhone("094 586 545");
        t1.setYear(1981);
        System.out.println(t1.getName() + " " + t1.getSalary() + " Phone - " + t1.getPhone());

        Administrator a1 = new Administrator();
        a1.setName("Anna");
        a1.setDepartment("Music");
        a1.setYear(1998);
        a1.setPhone("055 667 744");
        System.out.println("_____________________________");

        t1.printInfo();
        System.out.println("_____________________________");
        a1.printInfo();

    }
}