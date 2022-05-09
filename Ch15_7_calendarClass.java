import java.util.Calendar;
import java.util.TimeZone;

public class Ch15_7_calendarClass {
    public static void main(String[] args){

        // This below instance is for my default time zone
        // Calendar c = Calendar.getInstance();
        // System.err.println(c.getCalendarType());
        // System.out.println(c.getTimeZone());
        

        // The below instance is for your submitted time zone.
        Calendar c = Calendar.getInstance(TimeZone.getTimeZone("Asia/Singapore")); // here asia/singapore is the id of a timezone which is in string
        System.err.println(c.getCalendarType());
        System.err.println(c.getTime());
        System.out.println(c.getTimeZone().getID()); // . get id is for to get the id of a timezone
    }
    
}
