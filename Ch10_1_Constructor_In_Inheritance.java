class Base{
    Base(){
        System.out.println("I am a base class constructor");
    
    }
    Base(int a){
        System.out.println("I am an overloaded base class constructor wit the value of a as: "+a);
    
    }
}

class Derived extends Base{
    Derived(){
        // super(5);
        System.out.println("I am a derived class constructor");
    }

    Derived(int a,int b){
        super(a);
        System.out.println("I am an overloaded derived class constructor with the value or b as: "+b);

    }
}

class ChildofDerived extends Derived{
    ChildofDerived(){
        System.out.println("I am chile of derived constructor");
    }
    ChildofDerived(int a, int b, int c){
        super(a,b);
        System.out.println("I am an overloaded chile of Derived class constructor with the value or b as: "+c);
    }


}

public class Ch10_1_Constructor_In_Inheritance {
    public static void main(String[] args){
        // Base b = new Base(56);
        

        // When a DeriveClass is Extended for BaseClass
        // the constructor of base class execut first then the Derived class constructor executes

        // Derived d = new Derived();
        ChildofDerived c = new ChildofDerived(23,45,67);

    }
    
}