class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run(){ // You always have to use override a run() method to make a thread
        while(true){
            System.out.println("I am a thread of: "+this.getName());
        }
    }

} 


public class Ch13_4_threadPriorities {
    public static void main(String[] args){
        // Ready queue: T1, T2,t3
        MyThread t1 = new MyThread("Amit1");
        MyThread t2 = new MyThread("Amit2");
        MyThread t3 = new MyThread("Amit3");
        MyThread t4 = new MyThread("Amit4");
        MyThread t5 = new MyThread("Amit5 (Most Important)");
        t5.setPriority(Thread.MAX_PRIORITY); // To set priority to maximum.
        t1.setPriority(Thread.MIN_PRIORITY); // To set priority to minimum.
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
