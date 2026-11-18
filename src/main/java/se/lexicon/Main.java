package se.lexicon;
public class Main {

    public static void main(String[] args) {

        IO.println("Enter first number:");
        int firstNumber = Integer.parseInt(IO.readln());

        IO.println("Enter second number:");
        int secondNumber = Integer.parseInt(IO.readln());

        try {

            int result = firstNumber / secondNumber;

            IO.println("Result: " + result);

        } catch (ArithmeticException e) {

            IO.println("Cannot divide by zero!");

        }

    }
}
