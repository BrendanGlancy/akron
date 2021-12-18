import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FizzWriter {

    public static void main(String[] args) throws FileNotFoundException {
        // Define a file object
        File diskFile = new File("FizzBuzz.txt");

        // Define a printwriter
        PrintWriter outFile = null;

        if (diskFile.exists()) {
            System.out.println(diskFile + " Already exists, will be overwritten");
            outFile = new PrintWriter(diskFile);
        } else {
            outFile = new PrintWriter(diskFile);
            System.out.println("new file fizzbuzz.txt has be created in:\n" + diskFile.getAbsolutePath());
        }

        for (int i = 1; i <= 300; i++) {
            if (i % 3 == 0) {
                if (i % 5 == 0) {
                    outFile.println("FizzBuzz");
                } else {
                    outFile.println("Fizz");
                }
            } else if (i % 5 == 0) {
                outFile.println("Buzz");
            } else {
                outFile.println(i + "");
            }




        }

			System.out.println("FizzBuzz.txt has been created.");
			outFile.close();

    }
}
