
import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.err.println("Enter number");
        int A=sc.nextInt();
        boolean isprime=true;
        if(A<=1){
           isprime=false;
        }
        else{
            int mid=A/2;
            for (int i = 2; i <=mid; i++) {
                if(A%i==0){
                   isprime=false;
                    break;
                }
                
            }
            

        }
        if(isprime){
            System.err.println("prime");
        }
        else{
            System.err.println("not prime");
        }
    }
    
}
