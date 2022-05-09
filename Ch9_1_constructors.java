class MyMainEmployee{
    private int id;
    private String name;

    // Constructor: A member function used to initialize an abject while creating it.
    // This is a Constructor *****It automatically invoke without any explicite invoking.
    // In order to write our own constructor, we define a method with name same as class name.
    MyMainEmployee(){  //Constructore have the same name as class name and does not contain any  return type even Void also.
        id = 45;
        name = "CodeWithAmit";
    }

    public void setName(String name){
        // Here this.name refers to the name on 10th line and = name refers to the String Name that means 10th line =13th line
        this.name = name; 
    }
    public String getName(){
        return name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }

}

public class Ch9_1_constructors {
    public static void main(String[] args){
        MyMainEmployee Amit = new MyMainEmployee(); //This is a object
        // Insted of writing below code again and again for every property, 
        // we simpally create constructor amd then we dont wnt to set properties.See line 8-11.

        // Amit.setName("CodeWithAmit");
        // Amit.setId(96404);
        System.out.println(Amit.getName());
        System.out.println(Amit.getId());
        
    }
    
}
