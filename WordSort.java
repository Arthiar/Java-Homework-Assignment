
import java.util.Arrays;

public class WordSort {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question; " +
                      "Whether 'tis nobler in the mind to suffer " +
                      "the slings and arrows of outrageous fortune, " +
                      "or to take arms against a sea of troubles, " +
                      "and by opposing end them?";

        // Remove punctuation and split the text into words
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\s+");

        // Apply bubble sort to sort the words
        for (int i = 0; i < words.length - 1; i++) {
            for (int j = 0; j < words.length - i - 1; j++) {
                if (words[j].compareTo(words[j + 1]) > 0) {
                    // Swap words[j] and words[j + 1]
                    String temp = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = temp;
                }
            }
        }

        // Output the sorted words
        System.out.println("Sorted words: " + Arrays.toString(words));
    }
}
