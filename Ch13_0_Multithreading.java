// Creating a thread--> There are two ways to create a thread in java
// This is method one--> By creating Thread class..

class Mythread1 extends Thread{
    @Override
    public void run(){ // You always have to use override run() method to use thread..
        int i = 0;
        while(i<2){
            System.out.println("My thread1 is cooking");
            System.out.println("I am happy!");
            i++;
        }

    }
}

class Mythread2 extends Thread{
    @Override
    public void run(){
        int i = 0;
        while(i<2){
            System.out.println("My thread2 is chatting");
            System.out.println("I am sad!");
            i++;
        }

    }
}

public class Ch13_0_Multithreading {
    public static void main(String[] args){
        Mythread1 t1 = new Mythread1();
        Mythread2 t2 = new Mythread2();
        t1.start(); 
        t2.start();
        
    }
    
}
