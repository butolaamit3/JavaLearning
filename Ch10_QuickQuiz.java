// Create a class Animla and Derived another class Dog from it.

class Animal{
    public void color(){
        System.out.println("Black");
    }
    public void tail(){
        System.out.println("Yes I have a tail");
    }
    public void legs(){
        System.out.println("I have four legs");
    }
}

class Dog extends Animal{
    public void Sound(){
        System.out.println("Barking");
    }
}

public class Ch10_QuickQuiz {
    public static void main(String[] args){

        // Setting object for Animal(Base) class..
        Animal a = new Animal();
        a.color();

        // Setting object for Dog(Derived) class....
        Dog d = new Dog();
        d.tail();
        d.Sound();
    }
    
}
