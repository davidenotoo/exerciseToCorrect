package javabasics._16;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */

    private static void exercise1() {
        System.out.println("Exercise 1:");
        String conversionDescription = celsiusToFahrenheit(30); // funzione che accetta un argomento di tipo double
        System.out.println(conversionDescription);
    }

    // funzione che passa come parametro un valore double celsius e lo converte in double fahrenheit;
    private static String celsiusToFahrenheit(double celsius) {
        double fahrenheit = ((celsius * 9) / 5) + 32;
        String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
    }


    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */


    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        // richiamo la funzione ordinatore e passo come argomento la lista stessa.
        ordinatore(names);

        // stampo la lista ordinata non come array;
        for (String name : names) {
            System.out.println(name);
        }
    }
    private static void ordinatore(List<String> names) {
        // ciclo che permette di iterare nella lista, rimuovere gli spazi, maiuscolare tutto e
        // se contiene numeri trasforma il nome in "invalid", altrimenti lo scambia .set() col nome corretto;
        for (int i = 0; i < names.size(); i++) {
            String nomeAttuale = names.get(i);
            String nomeCorretto = nomeAttuale.trim().toUpperCase();
            if (nomeCorretto.matches(".*\\d+.*")) {
                names.set(i, "Invalid");
            } else {
                names.set(i, nomeCorretto);
            }
        }
    }

        /**
         * 3: Write a function that prints out every variable seen in the code. It should not return anything
         */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        double myLunchPrice = 5.99;
        String lunchType = "sandwich";
        String description = "Nice big sandwich";
        int weightInGrams = 500;

        // richiamo la funzione passando le variabili come argomenti;
        print(myLunchPrice, lunchType, description, weightInGrams);

    }

    // creazione di una funzione void che accetti come parametri le variabili;
    private static void print(double myLunchPrice, String lunchType, String description, int weightInGrams){
        System.out.println("myLunchPrice: " + myLunchPrice);
        System.out.println("lunchType: " + lunchType);
        System.out.println("description: " + description);
        System.out.println("weightInGrams: " + weightInGrams);
    }
}
