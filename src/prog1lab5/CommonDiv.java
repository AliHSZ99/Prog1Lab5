package prog1lab5;

import java.util.Scanner;

/**
 * This program computes the greatest common divisor of two integers. Gcd of two
 * or more integers id the largest positive integer that divides each. 8 and 12
 * is 4. Provide Type-Safe input.
 *
 * @author Ali Zoubeidi
 */
public class CommonDiv {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {

        System.out.println("\n****Welcome to the gcd calculator****");

        String garbage;
        int gcd = 0;

        Scanner scan = new Scanner(System.in);
        System.out.print("\nEnter your first integer > ");
        while (!scan.hasNextInt()) {
            System.out.print("Please enter a valid entry > ");
            garbage = scan.next();
        }
        int firstNum = scan.nextInt();

        System.out.print("Enter the second number > ");
        while (!scan.hasNextInt()) {
            System.out.print("Please enter a valid entry > ");
            garbage = scan.next();
        }
        int secondNum = scan.nextInt();

        int divisor = 1;

        while (firstNum % divisor == 0 || secondNum % divisor == 0) {
            if (firstNum % divisor == 0 && secondNum % divisor == 0) {
                gcd = divisor;
            }
            divisor++;
        }

        if (firstNum == secondNum) {
            gcd = firstNum;
            System.out.println("The gcd of equal integers is the number inputted: " + gcd);
        } else {
            System.out.println("\nThe gcd of " + firstNum + " & " + secondNum
                    + " is: " + gcd);
        }

    }
}
