package javabasics._8;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Using the 'Integer' and the String class, convert ourNumber below to an int
     * <p>
     * Once this is converted to an int, increase its value by 2
     * <p>
     * Then convert this back to a string and print it, it should be 90 and not 882
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");

        // variabile stringa iniziale;
        String ourNumberStr = "88";

        // la convertiamo in int mediante la Reference Integer e il metodo "sbloccato" .valueOf();
        int ourNumberInt = Integer.valueOf(ourNumberStr);

        // aggiungiamo 2;
        ourNumberInt += 2;

        // riconvertiamo in stringa e mandiamo a schermo;
        String ourNumberNewString = String.valueOf(ourNumberInt);
        System.out.println(ourNumberNewString);
    }

    /**
     * 2a: Convert ourChar to a String, make it uppercase
     * <p>
     * 2b: Play around line 37, experiment the integer of 0 to a number where it prints 'w', instead of 'H'
     * think about what the charAt method is doing?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2a:");

        // variabile a singolo carattere;
        char ourChar = 'a';

        // conversione in stringa;
        String ourCharString = String.valueOf(ourChar);

        // modifica in maiuscolo e stampa;
        ourCharString = ourCharString.toUpperCase();
        System.out.println(ourCharString);

        /* il metodo .charAt() ritorna un carattere splittato di una stringa,
           in questo caso in posizione 0, ovvero l'iniziale; */
        System.out.println(ourCharString.charAt(0));

        System.out.println("\nExercise 2b:");
        String anotherString = "Hello world";

        // la settima lettera (in posizione 6) di "Hello world" è w;
        int charAtIndex = 6;
        System.out.println("Make this print 'w' -> current result: '" + anotherString.charAt(charAtIndex) + "'");
    }


    /**
     * 3: This exercise currently throws 'exceptions' (big red error messages in our console)
     * <p>
     * Change the 3 lines indicated below so it no longer crashes, think about the type
     * conversions. "hello" can't be a number
     */

    private static void exercise3() {
        System.out.println("\nExercise 3:");

        // 1° problema: era un double 5.5, l'ho trasformato in int 5;
        String intStrToConvert = "5";
        System.out.println(Integer.valueOf(intStrToConvert));

        /* 2° problema: restituisce true se la stringa passata come argomento è uguale a "true"
           e restituisce false per qualsiasi altra stringa; */
        String booleanStrToConvert = "maybe";
        System.out.println(Boolean.valueOf(booleanStrToConvert));

        // 3° problema: una stringa contenente parole non può essere convertita in double da .valueOf();
        String doubleStrToConvert = "5.5";
        System.out.println(Double.valueOf(doubleStrToConvert));
    }


    /**
     * 4: Given our string 'startStr'
     * 4.1: use a string method to make sure it can convert to an int and convert it to an int
     * 4.2: Times our number by 2
     * 4.3: Convert back to a string, and concatenate our number with itself,
     * (i.e. 4 concatenated with itself is 44, not 8)
     * 4.4: Convert to a double and divide our number by 3.5
     * 4.5: Use Math.floor to remove decimal places on our number
     * <p>
     * Your result should be 288.0!
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");

        String startStr = "5 ";

        // 4.1 prima di utilizzare il metodo .valueOf() bisogna trimmare la stringa;
        int startInt = Integer.valueOf(startStr.trim());

        // 4.2 lo moltiplichiamo per 2;
        startInt *=2;

        // 4.3 lo riconvertiamo in stringa e lo concateniamo con se stesso;
        String startStr1 = String.valueOf(startInt);
        startStr1 += startStr1;

        // 4.4 lo convertiamo in double e dividiamo per 3.5;
        double startDouble = Double.valueOf(startStr1);
        startDouble /= 3.5;

        // 4.5  arrotondiamo;
        startDouble = Math.floor(startDouble);
        System.out.println(startDouble);

    }
}