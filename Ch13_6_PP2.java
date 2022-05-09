// PP1-Write a method to print "Good Morning" and "Good Afternoon" continuously on the screen in java using threads.
// PP2- And delay their executions

class Practice13 extends Thread{
    @Override
    public void run(){
        while(true){

            try {
                Thread.sleep(200);
            } 
            catch (Exception e) {
                System.out.println(e);

            }
            System.err.println("Good Morning");
        }
    }
}
class Practice13b extends Thread{
    @Override
    public void run(){
        while(true){
            try {
                Thread.sleep(200);
            } 
            catch (Exception e) {
                System.out.println(e);

            }
            System.err.println("welcome");
        }
    }
}

public class Ch13_6_PP2 {
    public static void main(String[] args){
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.setPriority(5);
        // p1.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());

        // p1.start();
        // p2.start();
    }
    
}
