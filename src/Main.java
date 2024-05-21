import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Creating an ArrayList to hold all the words in our dictionary which will be added from a text file
        List<String> words = new ArrayList<>();

        // We use try-catch to stop any file-reading commands from going wrong and crashing the program.
        try (BufferedReader br = new BufferedReader(new FileReader("C:/Users/Nabee/IdeaProjects/HangmanGame/src/words.txt"))) {
            String line; // holds the value on the current line of the text file
            while ((line = br.readLine()) != null) { // while the line is not empty
                for (String word : line.split(",")) { // Iterates over each word split by "," and assigns it to String 'word'
                    words.add(word.trim()); // takes our variable word, trims any white/blank space and then adds it to our ArrayList
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}