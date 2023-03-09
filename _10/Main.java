package javabasics._10;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4Bonus();
    }

    /**
     * AND = &&
     * OR = ||
     * XOR = ^
     */

    /**
     * 1: Using an if statement, print: "Comfortable clothes" if the following conditions are met:
     * <p>
     * isWarm is true and wearingShorts is true
     * isWarm is false and wearingShorts is false
     * <p>
     * If these conditions are not met, print: "Uncomfortable clothes"
     */
    private static void exercise1() {
        System.out.println("\nExercise 1 - Comfortable clothes:");

        double temperatureInCelsius = 25;
        double isWarmTemperatureInCelsius = 20;
        boolean isWarm = temperatureInCelsius >= isWarmTemperatureInCelsius;
        boolean wearingShorts = true;

        // o entrambe true o entrambe false;
        // TIP1: inserire solamente "isWarm" senza specificare "== true" è la stessa cosa;
        // TIP2: stessa cosa per il false, "isWarm == false" si può abbreviare con "!isWarm";
        if ((isWarm && wearingShorts) || (!isWarm && !wearingShorts)) {
            System.out.println("Comfortable clothes");
        } else {
            System.out.println("Uncomfortable clothes");
        }

    }

    /**
     * 2: We are going to automate the club bouncer, write a condition with an if statement with the && (and)
     * to check if someone is able to enter the club.
     * <p>
     * Their shoeType must be "fancy" AND they must be over 18 AND they must have at least 10 euros in their pocket
     * <p>
     * Write 1 if statement that checks all of these, print "Come in" if they meet the condition
     * or "stay out" if they don't.
     */
    private static void exercise2() {
        System.out.println("\nExercise 2 - Club Bouncer:");
        String shoeType = "fancy";

        int age = 30;
        double eurosInPocket = 7.5;
        double eurosForEntry = 10;

        if (eurosInPocket >= eurosForEntry && age >= 18 && shoeType == "fancy") {
            System.out.println("Come in");
        }else{
            System.out.println("stay out");
        }


    }

    /**
     * 3: Write an if else statement to calculate our grade
     * <p>
     * If our grade is 90%+ of the total, we print "A"
     * If our grade is 80%+ of the total, we print "B"
     * If our grade is 70%+ of the total, we print "C"
     * If our grade is 60%+ of the total, we print "D"
     * If our grade is under 60% of the total, we print "F"
     * <p>
     * If 'isTestRetry' we cap the maximum grade at C
     * <p>
     * Remember was can use ! to invert the value of a boolean, i.e. true -> false
     */
    private static void exercise3() {
        System.out.println("\nExercise 3 - Test Grader:");
        double ourTestScore = 8;
        double maxTestScore = 10;
        boolean isTestRetry = true;

        double grade = (ourTestScore * 100) / maxTestScore;

        // condizione in cui "isTestRetry == true;
        if (isTestRetry) {
            if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        } else { // [...] == false;
            if (grade >= 90) {
                System.out.println("A");
            } else if (grade >= 80) {
                System.out.println("B");
            } else if (grade >= 70) {
                System.out.println("C");
            } else if (grade >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }
    }


    /**
     * 4: BONUS! This is an optional task, but it is recommended you complete it
     * ---------------------------------------------------------------------------------
     * Write a XOR condition, print "safe" if only one car is driving down the road,
     * print "CRASH! or No cars" if not.
     * <p>
     * XOR = ^
     */
    private static void exercise4Bonus() {
        System.out.println("\nExercise 4 (Optional) - One way road:");
        boolean carIsDrivingFromLeftToRight = true;
        boolean carIsDrivingFromRightToLeft = false;

        //Write your code here
        if (carIsDrivingFromLeftToRight^carIsDrivingFromRightToLeft){
            System.out.println("safe");
        }else{
            System.out.println("CRASH!");
        }
    }
}

