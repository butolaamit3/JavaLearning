class Circle{
    private double radius;
    
    public void setRadius(double r){
        radius = r;
        
    }

    public double getRadius(){
        return 2*3.14*radius;
    }

}

public class Ch9_Quiz_circleArea {
    public static void main(String[] args){
        Circle bangle = new Circle();
        bangle.setRadius(4);
        System.out.println(bangle.getRadius());
    }
    
}
