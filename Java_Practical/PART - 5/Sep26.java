import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

class DuplicateNumberException extends Exception {
    public DuplicateNumberException(String message) {
        super(message);
    }
}

public class Sep26 {

    public static void checkForDuplicates(int[] numbers) throws DuplicateNumberException {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int number : numbers) {
            if (!uniqueNumbers.add(number)) {
                throw new DuplicateNumberException("Duplicate number found: " + number);
            }
        } 
        System.out.println("No duplicates found. All numbers are unique.");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        
        int[] numbers = new int[n];

        System.out.print("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        try {
            checkForDuplicates(numbers);
        } catch (DuplicateNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
