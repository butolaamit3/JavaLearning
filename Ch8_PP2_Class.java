class cellPhone{
    public void ring(){
        System.out.println("Ringing....");

    }

    public void vibrate(){
        System.out.println("Vibrating....");
    }

    public void callFriend(){
        System.out.println("Calling Ankit....");
    }
    
}

public class Ch8_PP2_Class {
    public static void main(String[] args){
        cellPhone Asus = new cellPhone();
        Asus.callFriend();
        Asus.vibrate();
        Asus.ring();
    }
    
}
