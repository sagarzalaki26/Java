
public class rightangle {
    public void angle(int A){
        int i,j;

        for(i=0;i<=A;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    

    public static void main(String[] args) {
        int A=5;
        rightangle obj=new rightangle();

        obj.angle(A);

    }
}
