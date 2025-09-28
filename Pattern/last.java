public class last {
    public static void main(String[] args) {
        int A=5;
        for(int i=1;i<=A;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }

            for(int k=1;k<=A-(i-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
