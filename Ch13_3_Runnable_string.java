class MyThread extends Thread{
    MyThread(Runnable r, String name){
        super(r,name);
    }
}
class MyThread1 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i<3){
            System.err.println("Hey! Good Morning");
            i++;
        }
           
    }
}
class MyThread2 implements Runnable{

    @Override
    public void run() {
        int i = 0;
        while(i<3){
            System.err.println("Hey! My name is amit");
            i++;
        }
        
        
    }

}

public class Ch13_3_Runnable_string {
    public static void main(String[] args){
        MyThread1 Bullet1 = new MyThread1();
        Thread gun1 = new Thread(Bullet1,"Amit");
        gun1.start();
        
        MyThread2 Bullet2 = new MyThread2();
        Thread gun2 = new Thread(Bullet2,"Harry");
        gun2.start();

        System.out.println("Id of thread 1 is: "+gun1.getId());
        System.out.println("Id of thread 1 is: "+gun2.getId());
    }
    
}
