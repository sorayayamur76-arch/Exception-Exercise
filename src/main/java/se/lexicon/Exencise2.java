package se.lexicon;

public class Exencise2 {
    public static void main(String[] args) {
        try {
            int number = readAndValidateNumber();
            IO.println("Valid number: " + number);

        } catch (NumberFormatException e) {
            IO.println("Invalid input! Please enter an integer.");
        } catch (InvalidRangeException e) {
            IO.println(e.getMessage());
        }
    }
    public static int readAndValidateNumber()
        throws InvalidRangeException {
        IO.println("Enter a number between 1 and 100:");
        int number = Integer.parseInt(IO.readln());
        if (number < 1 || number > 100) {
            throw new InvalidRangeException(
                    "Number must be between 1 and 100!"
            );
        }
        return number;
    }
}
