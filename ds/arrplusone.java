package ds;

import java.util.Scanner;

public class arrplusone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
    System.out.println("Enter array size:");
    int A=sc.nextInt();
    int []arr=new int[A];

    System.err.println("Enter array element:");
    for(int i=0;i<A;i++){
        arr[i]=sc.nextInt();
    }

    if(A>0){
        arr[A-1]+=1;
    }

    for(int i=0;i<A/2;i++){
        int temp=arr[i];
        arr[i]=arr[A-1-i];
        arr[A-1-i]=temp;
    }

    for(int num:arr){
        System.out.println(num);
    }
    

    }
    
}
