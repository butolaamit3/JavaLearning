import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

// Use time.API in java to print time in following formate 21:47:02 

public class Ch15_11_pp5 {
    public static void main(String[] args){

        LocalDateTime dt = LocalDateTime.now(); // This is local date time
        DateTimeFormatter df = DateTimeFormatter.ofPattern("H:m:s");
        String myDate = dt.format(df);
        System.out.println(myDate);
    }
    
}
