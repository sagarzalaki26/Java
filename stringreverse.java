
import java.util.Scanner;

public class stringreverse {
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        System.err.println("Enter String:");
        String input=sc.nextLine();
        String B="";
        for( int i=input.length()-1;i>=0;i--){
            B+=input.charAt(i);
        }
        System.err.println("revere:"+B);

    }
    
}
