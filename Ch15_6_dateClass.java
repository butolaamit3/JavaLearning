import java.util.Date;

// is it safe to store milisecond value in long var.

public class Ch15_6_dateClass {
    public static void main(String[] args){
        // System.out.println(Long.MAX_VALUE);
        // System.out.println(System.currentTimeMillis());
        // // yes it is safe to store.
        Date d = new Date();
        System.out.println(d);
        System.out.println(d.getDate());
        
    }
    
} 