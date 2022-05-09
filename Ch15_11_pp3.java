import java.util.Date;

// Use a date class in java to print time in following formate 21:47:02 

public class Ch15_11_pp3 {
    public static void main(String[] args){
        Date d = new Date();
        System.out.println(d.getHours()+":"+d.getMinutes()+":"+d.getSeconds());

    }
    
}
