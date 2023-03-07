package javabasics._4;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Store your age in an appropriate variable, print it out in
     * one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        int age = 25;
        System.out.println("I'm " + age + " years old.");

    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     * <p>
     * And then print them out on the same line using the following idea
     * <p>
     * System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        int myAge = 25;
        char myInitial = 'D';
        System.out.println("My Age: " + myAge + "; \n" +
                "My initial: " + myInitial + '.');
    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */
    private static void exercise3() {
        // numero dell'esercizio
        System.out.println("\nExercise 3:");

        // creiamo una variabile booleana chiamata "hasEatenLunch" e gli attribuiamo il valore "false"
        boolean hasEatenLunch = false;

        // creiamo una variabile di tipo double chiamata "lunchCost" e gli attribuiamo il valore "5.99"
        double lunchCost = 5.99;

        /* mandiamo a schermo (o stampiamo):
         1) una stringa creata direttamente all'interno delle parentesi + il valore "false" mediante l'utilizzo della variabile lunchCost;
         2) una stringa creata direttamente all'interno delle parentesi + il valore "5.99" mediante l'utilizzo della variabile hasEatenLunch;
        */

        // 1)
        System.out.println("Lunch cost = " + lunchCost);
        // 2)
        System.out.println("Has Eaten lunch = " + hasEatenLunch);
    }
}
