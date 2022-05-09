import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Ch15_10_dateTimeFormatter {
    public static void main(String[] args){
        LocalDateTime dt = LocalDateTime.now(); // This is local date time
        System.out.println(dt);

        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy--E"); // his is the formater for the above date and time.E is for Day
        String myDate = dt.format(df); // Creating myDate string using date and time formate.
        System.out.println(myDate);

        // predefine format
        DateTimeFormatter df2 = DateTimeFormatter.ISO_LOCAL_DATE;
        String DateTime = dt.format(df2);
        System.out.println(DateTime);
        
    }
    
}
