class Factory{  //This is the main class
    public void design(){
        System.out.println("Designing a car");
    }

    public void build(){
        System.out.println("building a car");
    }
}

//this is the inherited class here Factory ios the super class(parent) and car is the sub class(child)
class Car extends Factory{ 
    public void brand(){
        System.out.println("Tesla");
    }

}

public class Ch10_0_Inheritance_New {
    public static void main(String[] args) {
        Factory f1 = new Factory();
        f1.design();
        f1.build();
        // f1.brand(); --> error, You can not use methods of child class

    
        // We can use the method of  parent class because car class is derived from perend Factory class
        // you can extend all the classes except final class
        Car c1 = new Car();
        c1.design();
        c1.build();
        c1.brand();
    
        
    }
   
    
    
}
