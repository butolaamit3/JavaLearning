// Overload a Constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameter.

class Rectangle{
    private int length;
    private int breadth;

    Rectangle(){
        this.length = 4;
        this.breadth = 5;   
    }

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;

    }
    public int getlength(){
        return length;
    }
    public int getbreadth(){
        return breadth;
    }
}

public class Ch_9_5_pp3 {
    public static void main(String[] args){
        Rectangle box = new Rectangle(); // This is object.
        Rectangle r = new Rectangle(6,7);// This is object.

        System.out.println("This is the length of a rectangle: "+box.getlength());
        System.out.println("This is the breadth of a rectangle: "+box.getbreadth()+"\n");

        
        System.out.println("This is the custom length of a rectangle: "+r.getlength());
        System.out.println("This is the custom breadth of a rectangle: "+r.getbreadth());
    }
}
