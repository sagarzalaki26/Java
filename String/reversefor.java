public class reversefor {

    public static void main(String[] args) {

        String A="Sagar";
        String B="";

        for(int i=A.length()-1;i>=0;i--){
            B+=A.charAt(i);
        }
        System.out.println(B);
        
    }
    
}
