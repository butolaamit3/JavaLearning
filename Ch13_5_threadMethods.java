class MyThread1 extends Thread{
    
    @Override
    public void run(){ // You always have to use override a run() method to make a thread
        int i = 0;
        while(i<5000000){
            System.out.println("ThankYou");
            i++;
        }
    }

} 
class MyThread2 extends Thread{

    @Override
    public void run(){ // You always have to use override a run() method to make a thread
        // int i =0;

        while(true){
        System.out.println("ThankYou amit butola");
        try {
            Thread.sleep(120); // It stops this method by 120 miliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // i++;
        }
    }

} 

public class Ch13_5_threadMethods {
    public static void main(String[] args){
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();
        t1.start();
        // try{
        //     t1.join(); // We use this because we want to rum method1() completely then method2().
        //               //  And it gives error thats why we use try catch
        // }
        // catch(Exception e){
        //     System.out.println(e);
        // }
        t2.start();

        
    }
    
}
