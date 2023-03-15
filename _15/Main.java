package javabasics._15;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }

    /**
     * 1a: Edit this while loop to stop once our currentInvestmentValueEuros reaches €100,000
     * <p>
     * 1b: Change the same line, but now instead of currentInvestmentValueEuros reaching €100,000
     * <p>
     * Let's just run it for 5 years OR until it reaches €15,000 use || just like an if!
     */
    private static void exercise1() {
        System.out.println("Exercise 1 - Compounding Interest:");

        double currentInvestmentValueEuros = 10_000;
        double averageReturnFromStockMarketIndexPercentage = 8;
        double perYearMultiplier = 1 + (averageReturnFromStockMarketIndexPercentage / 100);
        int yearsPast = 0;
        double interestGainedThisYearEuros = 0;

        // condizione 1A:
        while (currentInvestmentValueEuros <= 100_000) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }

        // condizione 1B:
        while (currentInvestmentValueEuros <= 15_000 || yearsPast <= 5) {
            System.out.println("Investment value = €" + currentInvestmentValueEuros + " after " + yearsPast++ + " years" +
                    ", interest this year €" + interestGainedThisYearEuros);
            double previousYearsInvestment = currentInvestmentValueEuros;
            currentInvestmentValueEuros = currentInvestmentValueEuros * perYearMultiplier;
            interestGainedThisYearEuros = currentInvestmentValueEuros - previousYearsInvestment;
        }
    }

    /**
     * 2: Write a while loop for our trading bot!
     * <p>
     * The bot is going through a financial catastrophe! It's holding 10,000 great british pounds.
     * <p>
     * It wants to sell all of these as soon as possible! Before the state of Britain collapses, but it's a bit greedy.
     * It will only sell its pounds when the exchange rate is greater than 1.15 (poundToEuro)
     * <p>
     * On days where it sells, it can only sell 1000 pounds for euros.
     * <p>
     * Write a while loop
     * <p>
     * Use the calculation for exchange rate below
     * 1 + (Math.random() * 0.2);
     * <p>
     * to recalculate our rate every day (once per loop)
     * <p>
     * Print the number of days it takes for our bot to sell its pounds
     */
    private static void exercise2() {
        System.out.println("Exercise 2 - Selling the pound:");
        double poundToEuroExchangeRate = 1 + (Math.random() * 0.2);
        int daysToSell = 0;
        int remainingPoundsToSell = 10_000;
        int maxPoundsToSellPerDay = 1_000;

        // Scusami Francesco 😅 ma volevo creare dei controlli visivi per tutto, quindi ho esagerato nel System.out.println();


        // fintanto che ho più di 0 sterline (vale anche con un numero compreso tra 0 e 999 in quanto il counter decrementa di 1000 ogni volta);
        while (remainingPoundsToSell > 0) {

            daysToSell++; // aggiungo 1 al counter dei giorni;

            // se il tasso di cambio è maggiore di 1.15;
            if (poundToEuroExchangeRate >= 1.15) {
                remainingPoundsToSell -= maxPoundsToSellPerDay; // vendo, quindi tolgo 1000 al mio portafoglio;

                // stampa del "verbale di vendita POSITIVO" con il tasso arrotondato alla serconda cifra decimale;
                System.out.println("Giorno n° " + daysToSell  + " il tasso di cambio è " + Math.round(poundToEuroExchangeRate*100.0)/100.0 + " quindi POSSO vendere.  ✔ ");

            } else {
                // stampa del "verbale di vendita NEGATIVO" con il tasso arrotondato alla serconda cifra decimale;
                System.out.println("Giorno n° " + daysToSell + " il tasso di cambio è " + Math.round(poundToEuroExchangeRate*100.0)/100.0  + " quindi NON POSSO vendere.");
            }

            poundToEuroExchangeRate = 1 + (Math.random() * 0.2); // ricalcolo ad ogni giorno il tasso di cambio;


        }

        // stampa dei giorni totali necessari per vendere;
        System.out.println("\nIt took " + daysToSell + " to exit that cursed economy");
    }

    /**
     * 3: Write answers below for the following 4 situations, should we use a while, do while, fori or for each loop?
     *    Which would work best? Why?
     *
     * Q Example: Print out the numbers 1 to 10
     * A Example: fori
     *
     *
     * Q1: A user inputs their actions into an ATM, they can withdraw, deposit, check balance or exit. What loop should we use?
     * A1: DO per tutti gli utilizzi, WHILE per poter uscire dal programma;
     *
     * Q2: We have a list of 1000 users to send emails to
     * A2: FOR EACH per iterare facilmente tutta la lista;
     *
     * Q3: We want to print out the first 80 customer names from our bank database
     * A3: FOR I per partire dal primo e fermare la i<=80;
     *
     * Q4: We want to read a file 100 lines at a time, without loading the full file into our program
     * A4: DO per caricare le prime 100, nel WHILE possiamo per esempio inserire un evento per vedere se l'utente vuole vedere;
     */

}
