public class Removeduplicate {

    public static void main(String[] args) {
        
        String A="Sagarzalaki";

        String B="";
        for(char c:A.toCharArray()){
            if(B.indexOf(c)==-1){
                B+=c;
            }
        }
        System.out.println(B);
    }
    
}
