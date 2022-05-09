
class Father{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.print("Iam in Father(Base) class and setting x now: ");
        this.x = x;
    }

    public void printMe(){
        System.out.println("I am a Constructor");
    }

}
// Inheritance in java is declared using "extend" keyword..
class Son extends Father{  //this is used to inherit(availe) all the things of Base class ..
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }


}

public class Ch10_0_Inheritance {
    public static void main(String[] args){
    
    // Creating object of Father(Base) class..
    Father f = new Father();
    f.setX(4);
    System.out.println(f.getX());
    
    // Creating an abject of son(Deriver) class....
    Son s = new Son();
    s.setX(43);
    System.out.println(s.getX());
    s.printMe();
    s.setY(456);
    System.out.println(s.getY());
    s.getX();

    }
    
}

// Multiple Inheritance means making one child class by using multiple parent class.. 
// It is directly not supported in java, but it can be achieved by using Interfaces....
