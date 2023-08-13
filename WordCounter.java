import java.util.*;
import java.io.*;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter text or provide a file path: ");
        String input = scanner.nextLine();
        
        String text = "";
        
        if (input.endsWith(".txt")) {
            // Read text from file
            try {
                BufferedReader reader = new BufferedReader(new FileReader(input));
                String line;
                while ((line = reader.readLine()) != null) {
                    text += line + " ";
                }
                reader.close();
            } catch (IOException e) {
                System.err.println("Error reading the file: " + e.getMessage());
                return;
            }
        } else {
            // Use the input text provided by the user
            text = input;
        }
        
        String[] words = text.split("[\\s\\p{Punct}]+");
        int wordCount = words.length;
        
        System.out.println("Total words: " + wordCount);
        
        // Close the scanner
        scanner.close();
    }
}
