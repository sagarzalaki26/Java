public class CountAllChars {
    
public static void main(String[] args) {
    String A="aduhuincknjwuilwhuygvbjbxncliua";

    char[] ch=A.toCharArray();

    for(char c='a';c<='z';c++){
        int count=0;

        for(char cha:ch){

                if(cha==c){
                    count++;
                }

        }
        if(count>0){
            System.out.println(c+":"+count);
        }
    }
}
}
