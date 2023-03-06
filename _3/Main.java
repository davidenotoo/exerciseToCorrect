package javabasics._3;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // ---Non ho ben capito la richiesta dell'esercizio, provo a dare 2 possibili soluzioni---

        // 1:
        System.out.print('D');
        System.out.println('N');

        //2:
        char inizial0 = 'D';
        char inizial1 = 'N';
        System.out.print(inizial0);
        System.out.println(inizial1);


    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        System.out.println("Anni: " + 25);
        System.out.println("Ho pranzato? " + true);
        System.out.println("Prezzo del pranzo: " + 4.99 + "\n");


    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     * <p>
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        int anni = 25;
        boolean pranzo = true;
        double prezzo = 4.99;
        System.out.println("Anni: " + anni);
        System.out.println("Ho pranzato? " + pranzo);
        System.out.println("Prezzo del pranzo: " + prezzo);

    }
}
