public class Main {

    public static void main(String[] args) {
        int num = 5; // set the integer "num" to 5.
        System.out.println("before increment: " +num); // print the number.

        int incrementedNumber = increment(num); // call the "increment" method and send in the number (5). then assign the result to the "incrementedNumber" integer.
        System.out.println("after increment: " +incrementedNumber); // print the incremented number.

        int decrementedNumber = decrement(incrementedNumber); // call the "decrement" method and send in the incremented number (5). then assign the result to the "decrementedNumber" integer.
        System.out.println("after decrement: " +decrementedNumber); // print the decremented number.

        int num1 = 10; // set the integer "num1" to 10.
        int num2 = 50; // set the integer "num2" to 50.

        int multipliedNumber = multiply(num1, num2);
        System.out.println("\n" +num1 +" multiplied with " +num2 +" = " +multipliedNumber);
    }

    // method to increment the number that's sent in.
    public static int increment(int number) {
        return ++number; // increment the number (from 5 to 6) and return it.
    }

    // method to decrement the number that's sent in.
    public static int decrement(int number) {
        return --number; // decrement the number (from 6 to 5) and return it.
    }

    // method to multiply the numbers that are sent in.
    public static int multiply(int number1, int number2) {
        return number1*number2; // multiply the numbers (10 and 50) and return it.
    }
}