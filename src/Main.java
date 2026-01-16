// Project: Fibbonacci Sequence
// Professor: Ian O’Toole
// Course ID: 202620
// CRN: 23594
// Semester: Spring 2026
// Programmer: Johnathan McAllister

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public final static Scanner input = new Scanner(System.in);

    static void main(String[] args) {

        int value;

        try {
            System.out.print("Please enter the position of the value you want calculated here: ");
            value = input.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.print("Please enter a positive integer: ");
            value = input.nextInt();
        }


        int result = fib(value);

        System.out.printf("The %s term of the Fibonacci sequence is %s", value, result);

    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

}
