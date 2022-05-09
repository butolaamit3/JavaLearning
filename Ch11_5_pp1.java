// PP1 Create an abstract class pen with method write() and refil() as abstract method...

abstract class Pen{
    abstract void write();
    abstract void refil();
}
 class FountainPen extends Pen{

    @Override
    void write() {
        System.out.println("Wrirting");
        
    }

    @Override
    void refil() {
        System.out.println("Refiling the pen");
        
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }

 }

public class Ch11_5_pp1 {
    public static void main(String[] args){
        FountainPen p = new FountainPen();
        p.write();
        p.changeNib();
    }
    
}
