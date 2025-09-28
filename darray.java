
import java.util.Scanner;

public class darray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = new int[3][3];

        System.out.println("Enter the elements of the 3x3 matrix:");

        // Input
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = in.nextInt();
            }
        }

        // Output
        System.out.println("\nThe matrix is:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // Move to next line after each row
        }
    }
}
