public class reversepyaramid {
    public static void main(String[] args) {
        int A=5;

        for(int i=A;i>=1;i--){
            for(int j=1;j<=(A-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=2;i<=A;i++){
            for(int j=1;j<=(A-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(i*2-1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
