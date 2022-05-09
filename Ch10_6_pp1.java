// Create a class circle and use inheritance to create another class cylinder from it.


class Circle1{
    public int radius;
    Circle1(){
        System.out.println("I am circle non parametrized constructor");
    }

    Circle1(int radius){ //insted a using setter we use constructor to set the radius
        this.radius = radius;
        System.out.println("I am a circle parametrized constructor setting radius: "+radius);
    }

    public double area(){
        return 3.14*radius*radius;
    }
}


class Cylinder1 extends Circle1{
    public int height;
    Cylinder1(int radius, int height){
        super(radius);
        this.height = height;
        System.out.println("I am a cylinder parametrized constructor setting height: "+height);
    }
    
    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Ch10_6_pp1 {
    public static void main(String[] args){
        Cylinder1 c = new Cylinder1(4,6);
        System.out.println(c.area());
        System.out.println(c.volume());
    }
    
}
