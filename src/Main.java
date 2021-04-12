public class Main {

    public static void main(String[] args) {
        int num = 5; // set the integer "num" to 5.
        System.out.println("before increment: " +num); // print the number.

        int incrementedNumber = increment(num); // call the "increment" method and send in the number (5). then assign the result to the "incrementedNumber" integer.
        System.out.println("after increment: " +incrementedNumber); // print the incremented number.

        int decrementedNumber = decrement(incrementedNumber); // call the "decrement" method and send in the incremented number (5). then assign the result to the "decrementedNumber" integer.
        System.out.println("after decrement: " +decrementedNumber); // print the decremented number.
    }

    // method to increment the number that's sent in.
    public static int increment(int number) {
        return ++number; // increment the number (from 5 to 6) and return it.
    }

    // method to decrement the number that's sent in.
    public static int decrement(int number) {
        return --number; // decrement the number (from 6 to 5) and return it.
    }
}