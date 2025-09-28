
 import java.util.Scanner;
public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number:");
        int A=in.nextInt();
        int []arr=new int[A];
        System.out.println("Array Elelment:");
        for(int i=0;i<arr.length;i++){
            arr[i]=in.nextInt();
        }
        
        
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        
        for(int res:arr){
            System.out.println(res);
        }
    }
}