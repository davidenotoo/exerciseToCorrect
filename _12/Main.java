package javabasics._12;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1 - String score:");
        exercise1("Java runs on over 2 billion devices", 15);
        exercise1("+31 2 58765446", 48);
        exercise1("hello world", 42);

        System.out.println("\nExercise 2 - Meal score:");
        exercise2("sandwich", 2.5, 12.5);
        exercise2("soup", 10, 30);
        exercise2("soup", 1, 5);
    }

    /**
     * 1: We are going to 'score' strings, given a string you are to calculate its score based on the following factors.
     * <p>
     * Start with a base score of the string's length, this is the starting score. Use .length() on a string
     * <p>
     * The Maximum starting score is 20, if a score is over 20. Set it to 20.
     * <p>
     * If the string contains the letter a, -5 from the score
     * <p>
     * If the string is all lowercase, add 10 to the score.
     * <p>
     * If the score is now over 20, times it by 2
     */
    public static double exercise1(String text, double expectedScore) {
        double yourScore = 0;

        // metodo che restituisce il numero di caratteri e spazi presenti in una stringa o in un'array;
        yourScore = text.length();

        /*
         Math.min è un metodo che verifica il valore minore fra i 2 inseriti, quindi se yourScore
        è superiore a 20 viene considerato solo il 20(dopo la virgola);
         */
        yourScore = Math.min(yourScore, 20);

        // il metodo .contains() verifica se alla variabile è presente qualcosa che passiamo come parametro;
        if (text.contains("a")) {
            yourScore -= 5;
        }

        // 2 metodi:
        // ".toLowerCase()" restituisce na stringa tutta in minuscolo;
        // ".equals()" verifica se la stringa "text" e la stringa passata come parametro(la stessa in minuscolo) sono uguali;
        if (text.equals(text.toLowerCase())) {
            yourScore += 10;
        }
        if (yourScore > 20) {
            yourScore *= 2;
        }


        System.out.print("Expected score=" + expectedScore + ", actual score=" + yourScore);
        if (expectedScore != yourScore) {
            System.out.println(" - Failed: Wrong score for '" + text + "'");
        } else {
            System.out.println(" - Success!");
        }

        return yourScore;
    }

    /**
     * 2: We are going to 'score' a meal, given a string of mealType you are to calculate its score based on the following factors.
     * <p>
     * For the meal type sandwich calculate score like the following: 5 * weight
     * <p>
     * For the meal type of soup calculate score like the following 3 * weight
     * <p>
     * The minimum score should be 5, if a score is lower than this increase it to 5
     */
    public static double exercise2(String mealType, double weight, double expectedScore) {
        double yourMealScore = 0;

        // ho usato il metodo equals invece di ` mealType == "sandwich" `
        if (mealType.equals("sandwich")) {
            yourMealScore = 5 * weight;
        }
        if (mealType.equals("soup")) {
            yourMealScore = 3 * weight;
        }

        /*
         Math.max è un metodo che verifica il valore maggiore fra i 2 inseriti, quindi se yourMalScore
        è inferiore a 5 viene considerato solo il 5(dopo la virgola);
         */
        yourMealScore = Math.max(yourMealScore, 5);


        System.out.print("Expected score=" + expectedScore + ", actual score=" + yourMealScore);
        if (expectedScore != yourMealScore) {
            System.out.println(" - Failed: Wrong score for '" + mealType + "'");
        } else {
            System.out.println(" - Success!");
        }

        return yourMealScore;
    }
}
