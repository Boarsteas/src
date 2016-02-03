package testZ;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Date;

/**
 * Java PrintStream Example
 *
 * @author Krishna
 *
 */
public class Yodel {

    public static void main(String args[]) throws IOException {
        String fileName = "TextFile.txt";

        // Creating standard output as OutputStreamWriter
        PrintStream printStream = new PrintStream(System.out, true);
        printStream.println("This is example for PrintWriter!!");
        int intVar = 15;
        double dbVar = 20.0;
        printStream.printf("i = %d and k = %f", intVar, dbVar);

        // flush the instance pw
        printStream.flush();

        System.out.println("\n---------------------------------------");

        // write in a file (deletes the lines if exist)
        PrintStream printStreamFile = null;
        Date date = new Date();
        try {
            printStreamFile = new PrintStream(fileName);
            intVar++;
            printStreamFile.println(date);
            System.out.println("Write to the file successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } finally {
            // closing the output stream (best practice)
            if (printStreamFile != null) {
                printStreamFile.close();
            }
        }

        PrintStream printStreamFile1 = null;
        Object newLine = System.getProperty("line.separator");
        try {
            FileOutputStream fileWriter = new FileOutputStream(fileName, true);
            printStreamFile1 = new PrintStream(fileWriter);
            printStreamFile1.println(newLine);
            printStreamFile1.println("Add a line");
            System.out.println("Add new lines to the file successfully");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // closing the output stream (best practice)
            if (printStreamFile1 != null) {
                printStreamFile1.close();
            }
        }
    }
}
