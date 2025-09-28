
enum Level {
    LOW(1, "sdsd"),
    MEDIUM(2, "sfdf"),
    HIGH(3,"sfsdsd");
    

    private final int code;
    private final String description;

    Level(int code, String description){
        this.code = code;
        this.description = description;
    }

    public  int getcode(){
        return code;
    }
    public String getdescription(){
        return description;
    }

}

public class a {

    public static void main(String[] args) {
        Level var = Level.HIGH;
        System.out.println(var);
        System.out.print(var.getdescription() );
        System.out.print(var.getcode());


    }

}
