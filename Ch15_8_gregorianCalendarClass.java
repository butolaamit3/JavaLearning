import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Ch15_8_gregorianCalendarClass {
    public static void main (String [] args){
        Calendar c = Calendar.getInstance();
        System.err.println("Date is: "+c.get(Calendar.DATE)); 
        System.err.println("Seconds is: "+c.get(Calendar.SECOND));
        System.err.println("Time in Hours is: "+c.get(Calendar.HOUR));
        System.err.println("Time in 24 hrs formate: "+c.get(Calendar.HOUR_OF_DAY));

        GregorianCalendar g = new GregorianCalendar();
        System.out.println(g.isLeapYear(1996));
        System.out.println(TimeZone.getAvailableIDs()[0]);
        System.out.println(TimeZone.getAvailableIDs()[1]);
        System.out.println(TimeZone.getAvailableIDs()[2]);
        System.out.println(TimeZone.getAvailableIDs()[3]);
         

    }
    
}
