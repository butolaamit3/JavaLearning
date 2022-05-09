// 2. This is method two of creating a thread--> By implementing runnable interface.

class MyThreadRunnable1 implements Runnable{

    @Override
    public void run() { // You always have to use override a run() method to make a thread
        int i = 0;
        while(i<7){
            System.out.println("I am a thread1 not a threat1");
            i++;
        }
        
    }
    
}

class MyThreadRunnable2 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i<7){
            System.out.println("I am a thread2 not a threat2");
            i++;
        }
        
    }
    
}
public class Ch13_1_Multithreading {
    public static void main (String [] args){

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1(); // Creating object
        Thread gun1 = new Thread(bullet1); // Creating Thread and giving him (runnable)

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2(); 
        Thread gun2 = new Thread(bullet2);

        gun1.start(); // And you always invoke .start to run a thread instead of Run().
        gun2.start();

    }
    
}
