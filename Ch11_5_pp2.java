// Pp2 Create a class Monkey with jump() and bite() methods. 
// Create a class human which inherits this monkey class and implements BasicAnimal interface with eat() and sleep() method.. 

class Monkey{
    void jump(){
        System.out.println("Jumping....");
    }
    void bite(){
        System.out.println("Biting....");
    }

}
interface BasicAnimal{
    void eat();
    void sleep();
}


class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hello Sir Hello Sir....");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
        
    }

    @Override
    public void sleep() {
        System.err.println("Sleaping.....");
        
    }
    
}

public class Ch11_5_pp2 {
    public static void main(String[] args){
        Human Amit = new Human();
        Amit.eat();
        Amit.sleep();
        Amit.jump();
        Amit.bite();
        Amit.speak();
        System.out.println();

        Monkey m = new Human();  //This is polymorphism
        m.bite();
        // m.greet(); //--> can not use greet because the refrence is monkey whichj does not have speak method.
        System.out.println();

        BasicAnimal sudhir = new Human();
        // sudhir.speak();//-->Error
        sudhir.eat();
        sudhir.sleep();

    }
    
}
