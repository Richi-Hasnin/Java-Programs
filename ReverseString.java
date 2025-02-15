import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Reversing string
        String reversedString = new StringBuilder(inputString).reverse().toString();

        // Displaying result
        System.out.println("Reversed String: " + reversedString);

        scanner.close();
    }
}