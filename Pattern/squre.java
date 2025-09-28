
public class squre {

    public void st(int A) {

        int i,j;

        for(i=0;i<A;i++){
            for(j=0;j<A;j++){

                if(i==0||j==0||i== A-1||j==A-1){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

       public static  void main(String[] args) {

        int A=5;
        squre obj=new squre();
       obj.st(A);
        
       }
}
