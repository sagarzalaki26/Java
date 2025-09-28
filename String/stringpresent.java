

public class stringpresent {


    public static void main(String[] args) {
        String A="Sagar";
        char tar='a';
        int count=0;

        for(int i=0;i<A.length();i++){
            if(A.charAt(i)==tar){
                count++;

            }
        }

        find(A);

        int index=A.indexOf("r");
        System.out.println(index+1);
        System.out.println(count);
    }

    public static void  find(String A){

        StringBuffer as=new StringBuffer();
        as.append(A).reverse().toString();

        System.out.print(as);
    }
    
}
