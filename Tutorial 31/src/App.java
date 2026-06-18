import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        String fileName = "C:/Users/kdbbu/OneDrive/Documents/GitHub/Javascript_Peices/Tutorial 31/src/LinktoViaString.txt";
        File textFile = new File(fileName);

        try (Scanner in = new Scanner(textFile)) {
            if (!in.hasNextLine()) {
                System.out.println("File is empty.");
                return;
            }

            // Read first line and parse it as the target line number
            String firstLine = in.nextLine().trim();
            int targetLineNumber;
            try {
                targetLineNumber = Integer.parseInt(firstLine);
            } catch (NumberFormatException e) {
                System.out.println("First line is not a valid integer: " + firstLine);
                return;
            }

            // Read the rest of the file into a list, including the first line as line 1
            List<String> lines = new ArrayList<>();
            lines.add(firstLine);
            while (in.hasNextLine()) {
                lines.add(in.nextLine());
            }

            // Validate and print the requested line
            if (targetLineNumber < 1 || targetLineNumber > lines.size()) {
                System.out.println("Requested line " + targetLineNumber + " is out of range. File has " + lines.size() + " lines.");
            } else {
                String result = lines.get(targetLineNumber - 1);
                System.out.println("Line " + targetLineNumber + ": " + result);
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }
    }
}
