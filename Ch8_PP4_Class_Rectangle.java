class rectangle{
    int length;
    int breadth;

    public int area(){
        return length*breadth;
    }

    public  int perimeter(){
        return 2*(length+breadth);
    }
}

public class Ch8_PP4_Class_Rectangle {
    public static void main(String[] args){
        rectangle box = new rectangle();
        box.length = 4;
        box.breadth = 2;
        System.out.println("The area of a rectangular box is: "+box.area()+"\n");
        System.out.println("The perimeter of a rectangular box is: "+box.perimeter());
    }
    
}
