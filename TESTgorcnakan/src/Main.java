public class Main {
    public static void main(String[] args) {


        System.out.println("1. Print numbers from 1 to 15");

        for (int i = 1; i <= 15; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("2. Print even numbers from -10 to 20");
        for (int i = -10; i <= 20; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = -10; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        System.out.println("3. Print * symbols using given number");
        int n = 7;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("4. Print * symbols using given number in reverse mod");
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        System.out.println("\n5. Create an array with numbers 1-11");
        int[] array = new int[11];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        System.out.println("\n6. Create an array with even numbers from -10 to 10");
        int[] array2 = new int[11];
        /* array2[0] = -10;
        array2[1] = -8;
        array2[2] = -6;
        ---------------
        array2[verjin@] =10;*/
        for (int i = 0, j = -10; i < array2.length; i++, j += 2) {
            array2[i] = j;
        }
        // tarberak 1
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i] + " ");
        }
        System.out.println();

        // tarberak 2
        for (int i : array2) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("\n7. Given an array. print count of odd elements.");
        int[] array3 = {4, 0, 5, 87, 9, 14, 1, 2, 3, 56, 24};
        for (int a : array3) {
            if (a % 2 == 0)
                System.out.print(a + " ");
        }

        System.out.println("\n8. Given an array. print elements from -10 to 5.");
        for (int a : array3) {
            if (a >= -10 && a <= 5)
                System.out.print(a + " ");
        }

        System.out.println("\n\n9. Given an array print elements which can be divided 3 or 4");

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
        System.out.print("Count of even elements is " + "<" + countOfEvents + ">");
        array3 = new int[]{4, 1, 9, -4, 0, 3};

        System.out.println("\n\n11. Given an array print sum of elements");
        int sum = array3[0];
        for (int i = 1; i < array3.length; i++) {
            sum = sum + array3[i];
        }
        System.out.println("Given array elements sum is " + sum);

        System.out.println("\n\n12. Given an array print sum of positive elements");
        sum = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] >= 0) {
                sum += array3[i];
            }
        }
        System.out.println("Given array positive elements sum is " + sum);

        System.out.println("\n\n12.0. Given an array print negative elements");
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] < 0) {
                System.out.print(array3[i] + ", ");
            }
        }
        System.out.println("\n\n12.1. Given an array print multiplication of positive elements");
        int multiplicationSum = 1;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i] > 0) {
                multiplicationSum *= array3[i];
            }
        }
        System.out.println("Given array positive elements multiplication sum is " + multiplicationSum);

        System.out.println("\n\n12.2. Find maximal element from array");
        int maximumElement = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] > maximumElement)
                maximumElement = array3[i];
        }
        System.out.println("The array maximum element is " + maximumElement);

        System.out.println("\n\n12.3. Find minimal element from array");
        int minimumElement = array3[0];
        for (int i = 1; i < array3.length; i++) {
            if (array3[i] < minimumElement)
                minimumElement = array3[i];
        }
        System.out.println("The array maximum element is " + minimumElement);

        System.out.println("\n13. Find element which is alone");
        array = new int[]{1, 2, 3, 4, 9, 4, 3, 2, 1};
        int result = array[0];
        for (int i = 1; i < array.length; i++) {
            result = result ^ array[i];
        }
        System.out.println(result);
        int x = 4, y = 3;
        System.out.println("x = " + x + ", y = " + y);
        int z = x;
        x = y;
        y = z;
        System.out.println("x = " + x + ", y = " + y);

        System.out.println("\n14. Sort array in asc.");
        array = new int[]{455, 1, -9, 2, 1, 0, -748, 12, 1, 4};
        for (int a : array) {
            System.out.print(a + ", ");
        }
        int countOfFors = 0;
        boolean caniDerIfMtnume = true;
        while (caniDerIfMtnume) {
            caniDerIfMtnume = false;
            for (int i = 0; i < array.length - 1 - countOfFors; i++) {        //sa mekangamya cikl 1
                if (array[i] > array[i + 1]) {
                    int zz = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = zz;
                    caniDerIfMtnume = true;
                }
            }
            countOfFors++;
        }
        System.out.println();
        for (int a : array) {
            System.out.print(a + ", ");
        }


    }
}