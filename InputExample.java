 import java.util.Scanner;

public class InputExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: "); // Prompt the user

        int number = sc.nextInt(); // Read an integer from the user

        System.out.println("You entered: " + number); // Print the input
    }
}
 