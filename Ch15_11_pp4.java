import java.util.Calendar;

// Use a Calendar class in java to print time in following formate 21:47:02 


public class Ch15_11_pp4 {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        System.out.println(c.get(Calendar.HOUR_OF_DAY)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
        
    }
    
}
