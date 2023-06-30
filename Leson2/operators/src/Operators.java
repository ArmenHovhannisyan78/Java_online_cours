public class Operators {
    public static void main(String[] args) {
        int x45 = 98;
        int $x;
        int _x = 9;
        System.out.println(x45);
        System.out.println(_x);
        String firstName = "Armen";
        String last_name = "Hovhannisyan";
        System.out.println(firstName);
        System.out.println(last_name);

        int a = 4, b = 3;
        int c = a + b;
        System.out.println(c);
        c = a - b;
        System.out.println(c);
        System.out.println(a * b);

        int x = 7, y = 5;

        System.out.println(x / y);
        System.out.println(x % y);
        double t = 5.125, p = 8.250;
        System.out.println(t / p);

        x++;
        y--;
        System.out.println(x);
        System.out.println(y);

        x = 7;

        System.out.println(++x);
        System.out.println(x);

        x = 3;
        y = 4;
        c = x++ - --y;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("c = " + c);
        System.out.println("________________________");
        x = 7;
        y = 8;
        c = ++x + y--; // 8+8=16 x=8, y=7
        System.out.println(x++); // x=8
        System.out.println("c = " + c); //c=16
        System.out.println("x = " + x); //x=9
        System.out.println(--y); // y=6
        System.out.println("y = " + y); // y =6

        System.out.println("***********************************");

        boolean bb = x == 12; //x = 9 տես վերևում
        System.out.println("the bb is " + bb);
        System.out.println(x != 9);
        System.out.println(x > 4);
        System.out.println(x <= 44);
        System.out.println("____________");
        x = 11;
        System.out.println(x % 2 == 0);

        System.out.println(x >= 1 && x <= 9);
        boolean mianish = x >= 1 && x <= 9;

        boolean vv = x < 0 || x > 100;
        vv = false;
        System.out.println(!vv);

        System.out.println("*******************");
        System.out.println(8 ^ 5);
        System.out.println(17 | 24);
        System.out.println("*******************");
        x = 7;
        x += 2;
        x = 17;
        x &= 9;
        System.out.println(x);


    }
}


