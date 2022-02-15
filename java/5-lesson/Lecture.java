/**
 *
 * @author Brendan Glancy
 *
 * Terrible lecture on Java Methods
 *
 */

public class Lecture {
    // main method
    public static void main(String[] args) {
        // example of calling a method
        // returns false
        sleepIn(true, false);

        // Methods called in main, must be static
    }

    /**
     *
     * Example of a method
     *
     * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation
     * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
     * sleepIn(false, false) → true
     * sleepIn(true, false) → false
     * sleepIn(false, true) → true
     *
     * @param weekday
     * @param vacation
     * @return
     *
     */

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        if (weekday == true && vacation == false) {
            return false;
        } else if (weekday == false && vacation == true) {
            return true;
        } else if (weekday == false && vacation == true) {
            return true;
        } else {
            return true;
        }
    }
}
