import javax.swing.*;

public class ArraysLoops {
    public static void main(String[] args) {
        int[] myArray = new int[5];
        System.out.println(myArray[0]);
        myArray[0] = 10;
        myArray[1] = -25;
        myArray[2] = 33;
        myArray[3] = 66;
        myArray[4] = 99;
        System.out.println(myArray[4] + myArray[2]);
        System.out.println(myArray.length);
        System.out.println(myArray[1] + myArray[myArray.length - 1]);
        int[] aray = {4, 1, -8, 0, 3, 43, 6};
        // sa nuin bann e ete greinq     int[] array = new int[7];
        //                               array[0] = 4;
        //                               array[1] = 1;
        //                               array[2] = -8;
        //                               .............;
        //                               array[6] = 6;
        System.out.println(aray[0]);
        System.out.println(aray.length - 1);
        for (int s : aray) {
            System.out.print(s + ", ");
        }

        int x = 7;
        if (x > 0) {
            System.out.println("posetiv");
        } else
            System.out.println("none posetiv");


        int b;
        // if (x > 0)
        //   b = 1;
        // else
        //    b = 0;  այս երկար գրվածի փոխարեն կարող ենք գերլ ներքևինը եթե գործ ունենք թվային արժեքների հետ
        b = x > 0 ? 1 : 0;

        System.out.println(b);
        System.out.println("************************");

        //int x = -4;
        //System.out.println(x > 0 ? "Posetiv" : "none posetiv"); //սա վերը գրվածի կարճ տարբերակն է
        x = -4;
       /* if (x > 0) {
            System.out.println("positive");
        } else {
            if (x < 0)
                System.out.println("Negative");
            else
                System.out.println("zero");
        } */
        System.out.println(x > 0 ? "Posetive" : x < 0 ? "negative" : "zero");
        System.out.println("************************");

        x = 3;
        switch (x) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
            case 5:
                System.out.println("Java");
                break;
            default:
                System.out.println("Bigger");
        }

        System.out.println("************************");

        int tiv = 1;
        while (tiv < 11) {
            System.out.print(tiv++ + " ");
            //tiv ++;
        }
        System.out.println();
        System.out.println(tiv);
        System.out.println("*********************-------++++***");

        x = 6;
        do {
            System.out.println("Barev");
            x++;

        } while (x <= 6);
        System.out.println("*********************-------++++***");

        for (int i = 1; i <= 9; i++) {
            System.out.println("value x is: " + i);
        }

        System.out.println("*********************-------++++***");

        String[] names = {"Karen", "Armen", "Anna", "Rita", "Samvel", "Anush" };
        //   for (int index = 0; index < names.length; index++){
        //       System.out.println(names[index]);
        // }
        for (String s : names) {
            System.out.println(s);
        }
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println(names[i]);
        }

        for (int i = 0; i < 10; i = i + 2) {
            System.out.print("Armen" + " ");
        }
        System.out.println("");
        System.out.println("*********************-------++++***");

        int[] tiver = {1, 4, 5, -8, -6, -3, 12, -45};
        for (int k : tiver) {
            if (k < 0) {
                System.out.println("Ayo!!!!");
                break;
            }
        }
        System.out.println("*********************-------++++***");

        for (int i = 1; i <10 ; i++) {
            if(i == 5)
                continue;
                System.out.print(i + " ");
        }
    }


}

