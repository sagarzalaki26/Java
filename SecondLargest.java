public class SecondLargest{
public static void main(String[] args) {
    int []arr=new int[]{10,30,40,20,5};

    if(arr.length<2){
        System.err.println("on two element");
    }
int first=Integer.MIN_VALUE;
int second=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){

        if(arr[i]>first){
            second=first;
            first=arr[i];
        }
        else if(arr[i]>second && arr[i]!=first){
            second=arr[i];
        }
    }

    if(second==Integer.MIN_VALUE){
        System.err.println("All same");
    }else{
        System.err.println("Second num:"+second);
    }
}
}