package javabasics._13;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        // BONUS: creazione di numeri random da inserire;
        Random numeroRandom = new Random();

        // creazione di un nuovo numero random ad ogni ciclo e inserimento tramite .add();
        for (int i = 0; i < 8; i++) {
            int num = numeroRandom.nextInt(20); // da 0 a 20;
            numbers.add(num);
        }
        // stampa test
        System.out.println(numbers);

        // stampa del primo elemento dell'ArrayList
        System.out.println(numbers.get(0));

        // rimozione dei primi 3 elementi (.shift() in JS)
        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);

        System.out.println(numbers);
    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");

        //creazione delle liste;
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();

        // BONUS: inserimento di 3 prodotti per poter fare la prova;
        menuItems.add("Margherita");
        menuPrices.add(6.00);

        menuItems.add("Salsiccia e Frtiarielli");
        menuPrices.add(8.50);

        menuItems.add("Prosciutto e Funghi");
        menuPrices.add(8.50);

        // stampa degli elementi
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.println("Pizza " + menuItems.get(i) + " €" + menuPrices.get(i));
        }
    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        // variabile vuota;
        int sum = 0;

        // ciclo for sommare gli elementi;
        for (int i = 0; i < items.length; i++) {
            sum += items[i];
        }

        // stampa del risultato;
        System.out.println("La somma degli elementi è: " + sum);
    }
}