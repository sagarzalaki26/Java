public class AddString {
    
    public static void main(String[] args) {
        String A="Sdsd";
      
 String C="";
        for(int i=A.length()-1;i>=0;i--){
            
            C=C+A.charAt(i);

        }
        System.out.println(C);
        
        if(A.equals(C)){
            System.out.println("String IS pal");
        }
        else{
            System.out.println("not");
        }
        
    

 }
}
