import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Ch15_9_javaTime {
    public static void main(String[] args){

        LocalDate d = LocalDate.now(); // This is for whats the current date where your are present
        System.out.println(d);

        LocalTime t =  LocalTime.now(); // This is for whats the current time where your are present
        System.out.println(t);

        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);
    }
    
}
