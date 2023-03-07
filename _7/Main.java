package javabasics._7;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
    }

    /**
     * 1: Create a String to hold some text, decide on the text you want it to hold and then name it appropriately
     * <p>
     * print out your string in upper case, and in lower case
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");

        String frase = "Lorem Ipsum Dolor Sit Amet, Consectetur Adipiscing Elit.";

        System.out.println(frase + "\n" + frase.toUpperCase() + "\n" + frase.toLowerCase());
    }

    /**
     * 2: Edit the code below so it prints out the first name and last name in uppercase, and the middle name in lower case
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Change these
        String firstName = "Homer";
        String middleName = "Jay";
        String lastName = "Simpson";

        System.out.println(firstName.toUpperCase() + " " + middleName.toLowerCase() + " " + lastName.toUpperCase());
    }


    /**
     * 3: Assign the value of 2 or more primitive types to our variable textFrom2Primitives
     * <p>
     * Use the '+' operator
     * <p>
     * choose from these primitives: double, int, char, boolean
     * use primitive literals like: 1.5, 67, 'b', true
     * <p>
     * +
     * <p>
     * Experiment with these different types, how do an int and a double behave when added?
     * <p>
     * What about a boolean and an int?
     * <p>
     * "" + 1.5
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");

        String textFrom2Primitives = "String " + " " + true + " " + 4.20 + " " + 'C' + " " + 0.5f + " " + 33 + " " + false;
        System.out.println(textFrom2Primitives);
    }


    /**
     * 4: Without editing the Strings below make the print statement print
     * <p>
     * 1 2 3 4 5 6 7 8 9 with the correct spacing in between all the numbers
     * <p>
     * You will need to use .trim()
     */
    private static void exercise4() {
        System.out.println("\nExercise 4:");
        String endNumbers = "7 8 9";
        String middleNumbers = "       4 5 6";
        String earlyNumbers = "1 2 3";

        System.out.println(earlyNumbers + " " + middleNumbers.trim() + " " + endNumbers);
    }
}