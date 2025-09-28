package array;

public class darray {
    public static void main(String[] args) {
        // Scanner in= new Scanner(System.in);
        int[][] matrix;
        matrix=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        System.err.println("Enter the element of array:");

        // for(int i=0;i<3;i++){
        //     for(int j=0;j<3;j++){
        //         matrix[i][j];
        //         // =in.nextInt();

        //     }
        // }
        System.err.println("\nTHe matrix is:");
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.err.print(matrix[i][j] + " ");
            }
            System.err.println();
        }
    }
}
