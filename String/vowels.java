public class vowels {
    public static void main(String[] args) {
        String ch="Sagar";
        String B=ch.toLowerCase();
        int vowel=0;
        int con=0;

        for(int i=0;i<B.length();i++){
            char A=B.charAt(i);


            if(A=='a'||A=='e'||A=='o'||A=='i'||A=='u'){
                vowel++;
            }
            else{
                con++;
            }
        }

        System.out.println(vowel+" "+ con);
    }
}
