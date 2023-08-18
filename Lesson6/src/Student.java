public class Student extends Human{
    public Student() {
        System.out.println("new create");
        name = "Anna";
    }

    public Student(String n) {
        name = n;
    }

    public Student(String n, int age) {
        name = n;
        this.age = age;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;

    public void sum(int a, int b) {
        System.out.println(a + b);
    }

    public void sum(int a, int b, int c) {
        System.out.println(a + b + c);


    }

}
