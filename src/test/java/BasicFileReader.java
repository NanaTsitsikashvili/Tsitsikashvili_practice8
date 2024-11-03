
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileReader {
    public static void main(String[] args) {
        try (Scanner fileScanner = new Scanner

                (new File("data.txt"))) {

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }
    } }