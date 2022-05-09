

interface Camera{
    void takeSnap();
    void recordVideo();
    // Greet method last m banaya hai ye dekhne k liye ki private method implement kr sakte hain ki nahi..
    private void greet(){ //We dont able to use this method in derived method because it it private..
        // So how to use it, we use it in default method
        // We make this private method because whenever the logic of default method is so long then we use private method..
        System.err.println("Good Morning");
    }
    
    // void record4kVideo(); // This line we add in the last 
    // If we want to make a changes in interfaces or add a methods, the the only possible way is to make them default
    default void record4kVideo(){ // By using default we dont want to add this method to the derived class..
        greet(); // ye greet mane tab banaya jab mane private method banaya
        System.err.println("Recording videos in 4k....");
    
    }
}

interface Wifi{
    String[] getNetwork();
    void connectToNetwork(String network);
}

class CellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling: "+phoneNumber);
    }

    void pickCall(){
        System.out.println("Connecting...");

    }
    
}
class Smartphone extends CellPhone implements Camera,Wifi{

    public void takeSnap() {
        System.out.println("Taking Pictures");
        
    }
    public void recordVideo() {
        System.out.println("Video recording starts...");
        
    }
    public void record4kVideo() { // If we implement the default method then instead of default method this method is printing...
        System.out.println("Taking Snap and Recording in 4k...");
        
    }
    public String[] getNetwork() {
        System.out.println("Getting list of network");
        String[] networkList = {"Amit","Harry","Sudhir"};
        return networkList;
    }
    public void connectToNetwork(String network) {
        System.out.println("Connected to my network");
        
    }

}


public class Ch11_2_defaultMethod {
    public static void main(String[] args){
        Smartphone ms = new Smartphone();
        // me.greet();---error
        ms.record4kVideo();
        ms.callNumber(78789);
        String[] ar = ms.getNetwork();
        for (String items : ar) {
            System.err.println(items);
            
        }
        
    }
}
