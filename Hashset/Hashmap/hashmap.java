
import java.util.HashMap;
import java.util.Map;

public class hashmap {
    public static void main(String[] args) {
        
        HashMap<Integer,String> A=new HashMap<>();

        A.put(101,"Sagar");
        A.put(102,"dssdd" );

        System.out.println(A);
     for(Map.Entry<Integer,String>e:A.entrySet()){

        System.out.print(e.getKey()+" ");
        System.out.println(e.getValue());
     }

        

    }
}
