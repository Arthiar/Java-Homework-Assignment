
public class StringCharacters {
    public static void main(String[] args) {
        String text = "To be or not to be, that is the question; " +
                      "Whether 'tis nobler in the mind to suffer " +
                      "the slings and arrows of outrageous fortune, " +
                      "or to take arms against a sea of troubles, " +
                      "and by opposing end them?";

        int spaces = 0, vowels = 0, consonants = 0;

        // Loop through each character in the text
        for (int i = 0; i < text.length(); i++) {
            char ch = Character.toLowerCase(text.charAt(i));  // Convert to lowercase for uniformity

            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels++;
            } 
            // Check if it's a space
            else if (ch == ' ') {
                spaces++;
            }
            // Check if it's a letter (not a vowel) which makes it a consonant
            else if (ch >= 'a' && ch <= 'z') {
                consonants++;
            }
        }

        // Output the counts
        System.out.println("The text contains vowels: " + vowels);
        System.out.println("The text contains consonants: " + consonants);
        System.out.println("The text contains spaces: " + spaces);
    }
}
