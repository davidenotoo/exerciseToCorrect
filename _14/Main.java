package javabasics._14;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();

        //aggiunti 4 e 5 nel main;
        exercise4();
        exercise5();
    }

    /**
     * 1a: Use a FOR EACH loop to the total sum all the elements of the ArrayList itemsA
     * 1b: Use a FOR EACH loop to the total sum all the elements of the int array itemsB
     * 1c: Use a FOR I loop to the total sum all the elements of the int ArrayList itemsA
     * <p>
     * Print your results
     * <p>
     * Notice how we can use the same exact code for arrays and ArrayLists
     */
    private static void exercise1() {
        System.out.println("Exercise 1a:");
        List<Integer> itemsA = Arrays.asList(1, 56, 23);

        int sumForA = 0;

        // ciclo FOR EACH;
        for (int item : itemsA) {
            sumForA += item;
        }

        // stampa del risultato;
        System.out.println("Somma degli itemsA usando il ciclo FOR EACH: " + sumForA);

        System.out.println("\nExercise 1b:");
        int[] itemsB = new int[]{1, 56, 23};

        int sumForB = 0;

        // ciclo FOR EACH;
        for (int item : itemsB) {
            sumForB += item;
        }

        // stampa del risultato;
        System.out.println("Somma degli itemsB usando il ciclo FOR EACH: " + sumForA);


        System.out.println("\nExercise 1c:");

        int sumForC = 0;

        // ciclo FOR I; nelle collezioni si utilizza ".size()" invece di ".length()";
        for (int i = 0; i < itemsA.size(); i++) {
            sumForC += itemsA.get(i);
        }

        // stampa del risultato;
        System.out.println("Somma degli itemsA usando il ciclo FOR I: " + sumForC);


        if (sumForA != sumForB || sumForB != sumForC) {
            System.out.println("Failed, sums are different!");
        } else {
            System.out.println("Success, sums are the same!");
        }
    }

    /**
     * 2: Find the smallest and largest items in the arraylist
     * using a for each loop and an if statement/Math.min
     */
    private static void exercise2() {
        // ho inserito i titoli degli esercizi 2, 3, 4 e 5 non presenti nel codice, in modo da avere un run più ordinato;
        System.out.println("\nExercise 2:");
        List<Integer> items = Arrays.asList(300, 23, 56, 55, 84);
        int minNumber = Integer.MAX_VALUE;
        int maxNumber = 0;

        // ciclo per iterare fra i numeri della lista;
        for (int item : items) {
            // if st. per pescare il valore minore;
            if (item < minNumber) {
                minNumber = item;
            }
            // if st. per pescare il valore maggiore;
            if (item > maxNumber) {
                maxNumber = item;
            }
        }

        // versione col metodo Math.min e Math.max;
        for (int item : items) {
            minNumber = Math.min(minNumber, item);
            maxNumber = Math.max(maxNumber, item);
        }

        // stampa dei risultati
        System.out.println("Il valore minimo nella lista è: " + minNumber);
        System.out.println("Il valore massimo nella lista è: " + maxNumber);

    }

    /**
     * 3: Edit the fori loop below, so it only prints the first 2 names.
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        List<String> names = Arrays.asList("Alan", "Alice", "Antonio", "Aziz");

        for (
                int index = 0;
                index < 2; // sostituito "names.size()" con "2";
                index = index + 1
        ) {
            System.out.println(names.get(index));
        }
    }

    /**
     * 4: Edit the fori loop below, so it prints the 8 multiplication table
     * <p>
     * Bonus, how could we use a single variable to change our times table?
     * <p>
     * Multiplication tables, in case my vocabulary is different:
     * <a href="https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg">
     * https://i.pinimg.com/originals/e0/ca/5f/e0ca5f21a16a02edbba8b758e7aa4af5.jpg
     * </a>
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        for (
                int timesTableCurrentValue = 8; // modificato da 5 a 8;
                timesTableCurrentValue <= 80; // modificato da 50 a 80;
                timesTableCurrentValue = timesTableCurrentValue + 8 // modificato da 5 a 8;
        ) {
            System.out.println(timesTableCurrentValue);
        }

        // metodo bonus richiesto dall'esercizio;
        int tabellinaDel = 8;
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + tabellinaDel + " = " + (i * tabellinaDel));
        }
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * -------------------------------------------------------------------------<br/>
     * Inside of the fori loop below, write another fori loop to complete all
     * the multiplication tables between 1-10.
     * <p>
     * i.e. 5  = 5,10,15,20,25,30,35,40,45,50
     * <p>
     * When a loop in inside a loop, we call this a nested loop
     */
    private static void exercise5() {
        System.out.println("\nExercise 5:");
        //ciclo for per incrementare il MOLTIPLICANDO;
        for (int timesTableNumber = 1; timesTableNumber <= 10; timesTableNumber++) {

            // controllo dell'apostrofo sulle tabelline dell'1 e dell'8;
            if (timesTableNumber == 1 || timesTableNumber == 8) {
                System.out.println("\nTabellina dell'" + timesTableNumber + ":");
            } else {
                System.out.println("\nTabellina del " + timesTableNumber + ":");
            }

            // ciclo for annidato incrementare il MOLTIPLICATORE;
            for (int i = 1; i <= 10; i++) {
                System.out.println(i + " x " + timesTableNumber + " = " + (i * timesTableNumber));
            }

        }
    }
}
