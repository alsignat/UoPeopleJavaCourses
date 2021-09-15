package CS1102.unit2;

import textio.TextIO;

public class Loops {
    public static void main(String[] args) {
        // loop 1: sums natural numbers from 1 to 10
        int count = 1;
        int total = 0;

        while (count <= 10) {
            total += count;
            count++;
        }
        System.out.println("Loop1:");
        System.out.println("while loop result is " + total);

        int count2 = 1;
        int total2 = 0;
        do {
            total2 += count2;
            count2++;
        } while (count2 <= 10);
        System.out.println("do-while loop result is " + total2);

        int total3 = 0;
        for (int count3 = 1; count3 <=10; count3++) {
            total3 += count3;
        }
        System.out.println("for loop result is " + total3);

        // loop 2: asks user for the question
        System.out.println("\ndo-while loop started. Enter your input. Enter Stop to end loop");
        String userInput;
        do {
            userInput = TextIO.getln();
        } while (!"Stop".equals(userInput));
        System.out.println("do-while loop ended.");

        System.out.println("\nwhile loop started. Enter your input. Enter Stop to end loop");
        String userInput2;
        userInput2 = TextIO.getln();
        while (!"Stop".equals(userInput2)) {
            userInput2 = TextIO.getln();
        }
        System.out.println("while loop ended.");

        System.out.println("\nfor loop started. Enter your input. Enter Stop to end loop");
        String userInput3;
        for (;;) {
            userInput3 = TextIO.getln();
            if ("Stop".equals(userInput3)) {
                break;
            }
        }
        System.out.println("for loop ended.");

        // loop 3:  searching for first prime number greater than given number
        System.out.println("\nI will find first prime number greater than given number. Please enter integer value.");
        int numStart = TextIO.getlnInt();
        int primeNum;
        boolean notFound;

        System.out.println("\nSeaching with for loop:");
        notFound = true;
        for (primeNum = numStart;notFound;primeNum++) {
            if (CheckPrime.isPrime(primeNum)) {
                System.out.println("First prime number greater than " + numStart + " is " + primeNum);
                notFound = false;
            }
        }

        System.out.println("\nSeaching with while loop:");
        notFound = true;
        primeNum = numStart;
        while (notFound) {
            primeNum++;
            if (CheckPrime.isPrime(primeNum)) {
                System.out.println("First prime number greater than " + numStart + " is " + primeNum);
                notFound = false;
            }
        }

        System.out.println("\nSeaching with do-while loop:");
        notFound = true;
        primeNum = numStart;
        do {
            primeNum++;
            if (CheckPrime.isPrime(primeNum)) {
                System.out.println("First prime number greater than " + numStart + " is " + primeNum);
                notFound = false;
            }
        } while (notFound);
    }
}
