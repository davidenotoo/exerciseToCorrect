package javabasics._5;


public class Main {
    // Don't forget to use comments to clear things up if you need them!
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
        exercise5Bonus();
        playAroundWithModulus();
    }


    /**
     * 1: Create an int variable, add 1 to the value and then print it. Use the + operator
     * Then minus 1 from the same variable and print it.
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // creazione variabile;
        int number = 5;

        // incremento di 1
        number++; // si può scrivere anche: number += 1;
        System.out.println("Variabile + 1= " + number + ";");

        // decremento di 1
        number--; // si può scrivere anche: number -= 1;
        System.out.println("variabile - 1= " + number + ";");
    }

    /**
     * 2: Create a double variable, times by 2 and then print it.
     * <p>
     * Create another double variable, which is the previous variable divided by 2
     * and then print it
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        // creazione di una variabile decimale primitiva mediante la parola chiave "double";
        double decimalNumber = 4.21;

        // moltiplicazione rapida di una variabile per 2;
        decimalNumber *= 2;
        System.out.println(decimalNumber);

        // crezione di un'altra variabile che è il risultato della divisione per 2 della precedente;
        double decimalNumber1 = decimalNumber / 2;
        System.out.println(decimalNumber1);

    }

    /**
     * 3: We are going to convert the temperature from celsius to fahrenheit
     * <p>
     * Create a double variable called celsius
     * <p>
     * Create a new variable called fahrenheit
     * <p>
     * The variable fahrenheit should be set as
     * celsius times by 1.8 plus 32
     * <p>
     * Print out celsius and fahrenheit with 2 print statements
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // creazione di una variabile celsius;
        double celsius = 25;

        // creazione di una variabile fahrenheit che è il risultato di un'operazione di conversione;
        double fahrenheit = (celsius * 1.8) + 32;

        // stampa;
        System.out.println("Temperatura:\n" + celsius + "°C \n" + fahrenheit + "°F");
    }

    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age with a starting value of 10.
     * <p>
     * Only using the '++' operator increase this value to 15
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4:");

        // creazione variabile;
        int age = 10;

        // incremento poco celere di 5;
        age++;
        age++;
        age++;
        age++;
        age++;

        // stampa;
        System.out.println(age);
    }

    /**
     * 5: BONUS! This is an optional task, but it is recommended you complete it
     * ----------------------------------------------------------------------
     * Create an int called age set as 50
     * <p>
     * Using the -= operator change this value from 50 to 0 in one line of code,
     * <p>
     * Underneath create another int called secondAge set as 50
     * <p>
     * Change this value from 50 to 0 in 3 lines of code
     */
    private static void exercise5Bonus() {
        System.out.println("\nExercise 5:");

        // creazione variabile;
        int age = 50;

        // operazione di sottrazione;
        age-= 50; // si poteva anche scrivere age -= age;
        System.out.println(age);
    }

    /**
     * This is completely optional, but if you guys want to play around with
     * modulus to get a better understanding. Simply change the code below
     */
    private static void playAroundWithModulus() {
        System.out.println("\nModulus testing!:");

        int value = 26;   // <--- change this value
        int modulus = 3; // <--- and this value to see the results of modulus

        System.out.println("Modulus calculation, " + value + " % " + modulus +
                "=" + value % modulus);
    }

}
