public class prime {
    public static void main(String[] args) {
        int n=11;
        boolean A=false;

        for(int i=2;i<n;i++){
            if(n%i==0){
                A=false;
                break;
            }
            else{
                A=true;
            }
            

        }
        if(A==true){
            System.out.println("prime");
        }
        else{
            System.out.println("NOt prime");
        }
    }
}
