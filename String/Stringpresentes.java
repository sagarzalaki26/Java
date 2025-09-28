
import java.util.Scanner;


public class Stringpresentes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String A=sc.nextLine();

        char B=sc.next().charAt(0);
        int count=0;
        for( int i=0;i<A.length();i++){
            char a=A.charAt(i);
            if(B==a){
                count++;
            }
        }
System.out.println(count);

    }


}
