class MyThread extends Thread{
    MyThread(String name){
        super(name);
    }
    @Override
    public void run(){ // You always have to use override a run() method to make a thread
        int i = 0;
        while(i<3){
            System.out.println("I am a thread");
            i++;
        }
    }

} 

public class Ch13_2_threadConstructor {
    public static void main(String[] args){
        MyThread t1 = new MyThread("Amit");
        MyThread t2 = new MyThread("Alex");
        t1.start();
        t2.start();
        System.out.println("The Id of thread t1 is: "+ t1.getId());
        System.out.println("The Id of thread t1 is: "+ t1.getName());
        System.out.println("The Id of thread t1 is: "+ t2.getId());
        System.out.println("The Id of thread t1 is: "+ t2.getName());
    }
    
    
}
