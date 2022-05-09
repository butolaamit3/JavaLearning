// Create a class Cylinder and use getter setter to set its radius and height and find volume.
class cylinder{
    private int radius;
    private int height;

    public void setHeight(int n){
        height = n;
    }

    public int getHeight(){
        return height;
    }
    public void setRadius(int m){
        radius = m;
    }

    public int getRadius(){
        return radius;
    }

    public double volume(){
        return Math.PI*radius*radius*height;
    }
}

public class Ch9_5_pp1 {
    public static void main(String[] args){
        cylinder myCylinder = new cylinder();
        myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.volume());
    }
    
}
