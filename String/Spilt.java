public class Spilt {
    public static void main(String[] args) {
        String A="Sagar,Abh,iSrujal";

        String arr[]=A.split(",");
        for(String c:arr){
            System.out.print(c+" " );
        }
    }
}
