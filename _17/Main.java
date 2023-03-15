package javabasics._17;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        exercise1();
        exercise3();
    }

    /**
     * 1: Write code and fix the program below, you want to accept the questionableFunds
     * into the account!
     */
    private static void exercise1() {
        System.out.println("Exercise 1: ");

        /* un conto bancario deve necessariamente avere una variabile
         di tipo "long" per evitare imprevisti del genere*/
        long myBankBalanceEuro = 500;

        String suspiciousEmailMessage =
                """
                                    Hello Sir/Madam,
                                    
                                    I'm a prince here in [redacted] and I need help transferring my billions into
                                    Italy, please provide your bank account details and I will pay you generously.
                                    
                                    Thanks
                        """;

        long questionableFundsEuro = 5_000_000_000L;

        // operazione di somma;
        myBankBalanceEuro += questionableFundsEuro;
        // stampa
        System.out.println(suspiciousEmailMessage + "\nImporto totale: " + myBankBalanceEuro);


    }

    /*
      2: Given the following information, think about the MOST EFFICIENT (which uses least space)
         type to use to store such data. Why is this the most efficient?

         long = -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         double = 16 decimal places
         float = 7 decimal places
         int = -2,147,483,648 to 2,147,483,647
         short = -32,768 to 32,768
         byte = -127 to 127

         2a: Someone's age                                                         "short"
         2b: The age of a baby in months                                           "byte"
         2c: Money in a hedgefund in euros                                         "long"
         2d: Price of a good in euros on amazon.com                                "float"
         2e: The exact weight of an apple measured by scientific equipment         "double"
         2f: The number of kilometers from any 2 places in the world               "short"

     */

    /**
     * 3: Use the LOCALDATE type (LocalDate.now()) to print out the current date
     * <p>
     * Play around with local date! What can you get it to do?
     * Use at least the following methods on myDate().
     * * getDayOfMonth()
     * * getDayOfWeek()
     * * getDayOfYear()
     * * getMonth()
     * * getMonthValue()
     * * use isBefore() and isAfter() to compare with other dates, use LocalDate.of(year, month, day) to
     * create other days
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");

        {
            // data attuale;
            System.out.println(LocalDate.now());
            // giorno del mese;
            System.out.println(LocalDate.now().getDayOfMonth());
            // giorno della settimana;
            System.out.println(LocalDate.now().getDayOfWeek());
            // giorno dell'anno;
            System.out.println(LocalDate.now().getDayOfYear());
            // mese;
            System.out.println(LocalDate.now().getMonth());
            // numero del mese;
            System.out.println(LocalDate.now().getMonthValue());
        }

        {
            // esempio di isBefore();

            LocalDate compleanno = LocalDate.of(2023, Month.DECEMBER, 11);
            LocalDate oggi = LocalDate.now();

            // se quest'anno ho già fatto il compleanno lo considero per l'anno prossimo;
            if (compleanno.isBefore(oggi)) {
                compleanno = compleanno.plusYears(1); // metodo trovato online;
            }

            // calcolo dei giorni che mancano al mio compleanno;
            long giorniAlCompleanno = oggi.until(compleanno, ChronoUnit.DAYS); //metodo trovato online;

            // stampa
            System.out.println("Mancano " + giorniAlCompleanno + " giorni al mio compleanno!");
        }

        {
            // esempio di isAfter() nei voli;

            LocalDate andata = LocalDate.of(2023, 8, 15);
            LocalDate ritorno = LocalDate.of(2023, 8, 20);

            if (andata.isAfter(ritorno)) {
                // messaggio che dà l'app Rayanair;
                System.out.println("Hai selezionato il ritorno in una data precedete all'andato, Non siamo una macchina del tempo");
            } else {
                System.out.println("Aggiungi 7 valigie a pagamento o non ti faccio volare 🤡");
            }
        }

    }

}
