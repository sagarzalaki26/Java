public class pyramid {
    
    public static void main(String[] args) {
        int A=5;

        for(int i=1;i<=A;i++){
            for(int j=1;j<=A-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=A-1;i>=1;i--){
            for(int j=1;j<=A-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(2*i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
