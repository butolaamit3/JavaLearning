// Create a class Cylinder and use constructor and find its volume.
class cylinder{
    private int height;
    private int radius;

    cylinder(int height,int radius){
        this.height = height;
        this.radius = radius;
    }
    
    public int getHeight(){
        return height;
    }
    
    public int getRadius(){
        return radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Ch9_5_pp2 {
    public static void main(String[] args){
        cylinder myCylinder = new cylinder(12,9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.getHeight());
        System.out.println(myCylinder.volume());
    }
    
}
