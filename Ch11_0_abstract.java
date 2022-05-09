// Abstract class are those class whose you can not create a object.
// Because abstract class is not an actual class, it is an standard to create other classes.

// In this "Parent" is a standard(jariya) to create a actual class(Concreate class) "Child"

abstract class Parent{ 
    Parent(){
        System.out.println("I am a constructor");
    }

    public void sayHello(){
        System.out.println("Hello my dear friends");
    }

    abstract public void greet();
    abstract public void greet2();

}

class Child extends Parent{
    @Override    // When we create a child class form parent abstract class we have two option.
    // 1.override the the abstract methode from child class
    // 2. Make child class to abstract class, in this class we choose 1nd option we override the abstract methods.
    public void greet(){
        System.out.println("Good Morning");
    }

    @Override
    public void greet2() {
        System.out.println("Good Afternoon");
        
    }
}

abstract class Child2 extends Parent{ // In this we choose 2st option we create the abstract child  class of the parent class.
    public void Health(){
        System.out.println("I am Good");
    }
}

public class Ch11_0_abstract {
    public static void main(String[] args){
        // Parent p = new Parent(); ---error // It is not possible because you Parent is a abstract class.
        Child c= new Child();
        // Child2 d = new Child(); ---error // It is also a abstract class
        c.greet();
    }
    
}
 