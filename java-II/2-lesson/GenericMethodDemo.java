public class GenericMethodDemo {
    public static void main(String[] args) {

        // Create 3 arrays, int dbl and String
        // Have to use Integer and Double for the generic method
        // you cannot use primative types when passing in the generic method
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] dblArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        String[] strArray = { "one", "two", "three", "four", "five" };

        // Print the arrays using the printArray method
        System.out.println("intArray: ");
        printArray(intArray);

        System.out.println("dblArray: ");
        printArray(dblArray);

        System.out.println("strArray: ");
        printArray(strArray);

    }

    // Generic method that prints an array of any type
    // @param <T> - generic type
    // @param array - array to be printed
    // @return - void
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

}
