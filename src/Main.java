public class Main {

    public static void main(String[] args) {
        int num = 5; // set the integer "num" to 5.
        System.out.println("before increment: " +num); // print the number.

        int incrementedNumber = increment(num); // call the "increment" method and send in the number (5). then assign the result to the "incrementedNumber" integer
        System.out.println("after increment: " +incrementedNumber); // print the incremented number.
    }

    // method to increment the number that's sent in.
    public static int increment(int number) {
        return ++number; // increment the number (from 5 to 6) and return it.
    }
}
