
public class PrimeNumbers {
    public static void main(String[] args) {
        int nValues = 50; // Check prime numbers up to 50
        
        // Outer loop to check each number from 2 to nValues
        outerLoop:
        for (int i = 2; i <= nValues; i++) {
            // Check divisibility up to the square root of i
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    // If divisible, it's not a prime, continue to the next number
                    continue outerLoop;
                }
            }
            // If we reach here, i is a prime number
            System.out.println(i);
        }
    }
}
