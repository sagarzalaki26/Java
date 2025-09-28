
import java.util.HashSet;
import java.util.Iterator;

public class hashset1{
    public static void main(String[] args) {
        
        HashSet<Integer> A=new HashSet<>();

        A.add(1);
        A.add(12);
        A.add(13);

        System.out.println(A.contains(12));
        System.out.println(A);
 
        Iterator it=A.iterator();
        while (it.hasNext()) { 
            System.out.println(it.next());
        }
    }
}