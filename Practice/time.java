import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class time {
    public static void main(String[] args) {
        
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

        System.out.println("Raw time: " + time);
        System.out.println("Raw date: " + date);

        DateTimeFormatter dateFmt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        DateTimeFormatter timeFmt = DateTimeFormatter.ofPattern("HH:mm:ss");

        String formattedDate = date.format(dateFmt); 
        String formattedTime = time.format(timeFmt); 

        System.out.println("Formatted date: " + formattedDate);
        System.out.println("Formatted time: " + formattedTime);
    }
}
