import java.net.SocketOption;

public class AreasLab {
    public static void main(String[] args) {
        System.out.println("1. Print numbers from 1 to 15");
        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n2. Print even numbers from -10 to 20");
        for (int i = -10; i < 21; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        int n = 5;
        System.out.println("\n\n 3. Print * symbols using given numbers");

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n 3.1. Print * symbols using given numbers revers mod ver1");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
        System.out.println("\n 4. Print * symbols using given numbers revers mod ver2");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n 5. Create an array with numbers 1-11");
        //int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};  ete mec tver en apa sa harmar chi
        int[] array = new int[11]; // sa inchpes giteinq sarqwum enq zangvac 11 tvic baxkacac, voronc skzbnakan arjeqener@ 0 en
        //array[0] = 1; ais tarberakob zangvacnerin arjeq tal@ nuinpes harmar che mec arjeqneri depqum
        //array[1] = 2;
        //array[2] = 3;

        for (int i = 0, k = 1; i < array.length; i++, k++) {
            array[i] = k;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\n\n 6. Create an array with even numbers -10 to 10" + " ");
        int[] array2 = new int[11];
        //      array2[0] = -10;
        //      array2[1] = -8; //ev ailn minchev 10-@
        //      array2[9] = 10;

        for (int i = 0, k = -10; i < array2.length; i++, k += 2) {
            array2[i] = k;
        }
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        for (int i = 0, k = -10; i < array2.length; i++, k += 2) {
            array2[i] = k;
        }
        for (int i : array2) {         //sa, inchpes ancel enq forich tarberakov e, erb cikl@ partadir
            System.out.print(i + " "); // ancnum e zangvaci bolor elemntneri vrayov
        }

        System.out.println("\n\n7. Given an array. print count add elements");
        int[] array3 = {-3, 6, -5, 8, 9, 12, 56, 89, 47, 54, 7, 22}; // tpum enq miayn kent ekementner@
        for (int a : array3) {
            if (a % 2 == 1)
                System.out.print(a + " ");
        }
        System.out.println("\n\n8. Given an array. print elements from -10 to 5");
        for (int a : array3) {
            if (a >= -5 && a <= 40)
                System.out.print(a + " ");
        }
        System.out.println("\n\n9. Given an array print elements which cane be divided 3 or 4");
        for (int a : array3) {
            if (a % 3 == 0 || a % 4 == 0)
                System.out.print(a + " ");
        }
        System.out.println("\n\n10. Given an array print count of even elements");
        int countOfEvents = 0;
        for (int a : array3) {
            if (a % 2 == 0)
                countOfEvents++;
        }
        System.out.print("Count of elements is  " + countOfEvents);
        array3 = new int[]{10, 7, 8, -4, 0, 3, 25, -18};

        System.out.println("\n\n11. Given an array print sum of elements");
        int sum = 0;
        for (int a : array3) {
            sum = sum + a;
        }
        System.out.println("Sum of elements is  " + sum);

        int sum1 = array3[0];
        for (int i = 1; i < array3.length; i++) {
            sum1 = sum1 + array3[i];
        }
        System.out.println("Sum of elements is  " + sum1);

        System.out.println("\n12. Given an array print sum of positive elements");
        sum = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0) sum += array3[i];
        }
        System.out.println("Sum of positive elements is  " + sum);

        System.out.println("\n13. Given an array print multiplication of positive elements");
        int summ = 1;
        for (int a : array3) {
            if (a > 0) summ = a * summ;
        }
        int sumn = 1;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0)
                sumn *= array3[i];
        }
        System.out.println("multiplication sum elements is " + summ + "\nmultiplication sum elements is " + sumn);


        System.out.println("\n13. Given an array find maximal elements");
        int max = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > max)
                max = array3[i];
        }
        System.out.println("Given array maximum number is " + max);

        System.out.println("\n13.1 Given an array find minimal elements");
        int min = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < min)
                min = array3[i];
        }
        System.out.println("Given array maximum number is " + min);

        System.out.println("\n14 Find element which is alone");
        array = new int[]{4, 2, 1, 9, 2, 1, 4};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println("find element is " + result);

        int x = 4, y = 3;
        if (x > y) {
            int z = x;
            x = y;
            y = z;
        }
        System.out.println("x = " + x + ",  " + "y = " + y);

        System.out.println("\n15 Sort array in asc.");
        array = new int[]{445, 1, -9, 2, 1, 0, -748, 4, 1, 12};
        for (int a : array) {
            System.out.print(a + ", ");
        }
        int countOfFors = 0;
        boolean qaniDerIfMtnume = true;
        while (qaniDerIfMtnume) {
            qaniDerIfMtnume = false;
            for (int i = 0; i < array.length - 1 - countOfFors; i++) {
                if (array[i] > array[i + 1]) {
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    qaniDerIfMtnume = true;
                }
            }
            countOfFors++;
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + ", ");
        }
        System.out.println("\n Count of for is " + countOfFors);
    }
}
