public class OverloadedMethods {
    public static void main(String[] args) {

        // Create 3 arrays, int dbl and String
        int[] intArray = { 1, 2, 3, 4, 5 };
        double[] dblArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] strArray = { "one", "two", "three", "four", "five" };

        // Print the arrays using the printArray method
        System.out.println("intArray: ");
        printArray(intArray);

        System.out.println("dblArray: ");
        printArray(dblArray);

        System.out.println("strArray: ");
        printArray(strArray);

    }

    // Prints an array of ints
    public static void printArray(int[] array) {
        // use for each loop
        for (Integer i : array) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }

    // Prints an array of doubles
    public static void printArray(double[] array) {
        // use for each loop
        for (Double i : array) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }

    // Prints an array of strings
    public static void printArray(String[] array) {
        // use for each loop
        for (String i : array) {
            System.out.printf("%s ", i);
        }
        System.out.println();
    }
}
