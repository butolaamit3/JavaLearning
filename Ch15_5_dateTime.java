public class Ch15_5_dateTime {
    public static void main(String[] args){
        System.out.println("Number of miliseconds passed since 1 Jan 1970: "+System.currentTimeMillis()); 
        System.out.println("Number of second passed since 1 Jan 1970: "+System.currentTimeMillis()); 
        System.out.println("Number of minutes passed since 1 Jan 1970: "+System.currentTimeMillis()/1000/60); 
        System.out.println("Number of hours passed since 1 Jan 1970: "+System.currentTimeMillis()/1000/60/60); 
        System.out.println("Number of days passed since 1 Jan 1970: "+System.currentTimeMillis()/1000/60/60/24); 
        System.out.println("Number of years passed since 1 Jan 1970: "+System.currentTimeMillis()/1000/60/60/24/365); 

    }
    
}
