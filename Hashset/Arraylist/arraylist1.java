
import java.util.ArrayList;
import java.util.Scanner;

public class arraylist1 {

    public static void main(String[] args) {

        ArrayList<Integer> A = new ArrayList<Integer>();
        ArrayList<String> B = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 5; i++) {
            A.add(sc.nextInt());
        }

        System.out.println(A.get(0));

        A.set(3,20 );

        System.out.println(A);

    }
}
