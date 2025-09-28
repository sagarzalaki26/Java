
import java.util.Scanner;

public class reveresenum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int A=sc.nextInt();
        int B=A;
        int result=0;

        while (A>0) {
            
            int lastd=A%10;
            result=result*10+lastd;
            A=A/10;
            
        }
        System.out.println("Reversed num is:"+result);
        // palindrome number
  System.err.println("r"+result);
        if(B==result){
          
            System.out.println("the given number is palindrome num");
        }
        else{
            System.err.println("Not palindrome");
        }
        return;
    }
    
}
