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

    // funzione che ordina,
    private static String ordinatore(String name){
        String nomiOrdinati = name.trim().toUpperCase(); // rimuovo gli spazi extra e rendo maiuscolo;
        if (nomiOrdinati.matches(".*\\d.*")){ // espressione regolare del metodo matches() per pescare i numeri;
            nomiOrdinati = "invalid"; // dichiarazione di nome utente non valido se sono presenti numeri;
        }
        return nomiOrdinati; // la funzione tirerà fuori questo valore;
    }
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            // nuova stringa che viene dichiarata utilizzando il metodo scritto prima,
            // passando come argomento la lista "names";
            String risultato = ordinatore(name);
            System.out.println(risultato);
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
