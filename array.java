
import java.util.Scanner;

class array{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int []empno=new int[5];
          System.err.println("Enter arry value:");
        for(int i=0;i<empno.length;i++){
         empno[i]=in.nextInt();
               
        }

        for(int j=0;j<empno.length;j++){
            System.err.println("Array value are:"+empno[j]);
        }
    }

}