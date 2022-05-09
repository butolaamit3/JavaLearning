// Why we choose interfaces instead of Abstract class if those are the same.
// We choose interfaces because we createa child class from multiple parent or also extend one class.
// We can Implement one or more than one interfaces by using one class
// In abstract class we ony able to extend one child class from parent class
// In interface Extend class you always have to public Overrided methods..

// Multiple Inheritance means making one child class by using multiple parent class.. 
// It is directly not supported in java, but it can be acchieved by using Interfaces....

// In interface we strictly need to override interface methods, but we do not need to define interface properties..
// _Interfaces method are public by default
// We can create to refrence of the interfaces but not the object.

interface Bicycle{
    int a = 45; //You can create properties in interfaces
    void applybreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    void blowHornKgf();
    void blowHornTargen();
}

class AvonCycle implements Bicycle,HornBicycle{
    void blowHorn(){
        System.out.println("Playing Horn");

    }
    @Override
    public void applybreak(int decrement) {
        System.out.println("Applying Break");
        
    }
    @Override
    public void speedUp(int increment) {
        System.out.println("Increasing Speed");
        
    }
    @Override
    public void blowHornKgf() {
        System.out.println("Nah NAh ne nah re ");

    }
    @Override
    public void blowHornTargen() {
        System.out.println("Taaaaargennnnnnn");
        
    }


}
public class Ch11_1_Interfaces {
    public static void main(String[] args){
        AvonCycle amit = new AvonCycle();
        amit.applybreak(1);
        // You can create the properties in interfaces.
        System.out.println(amit.a);
        // You cannot modify the properties in Interfaces as they are final,
        // but you can see how to modify it by using DefaultMethod in next exercise.
        amit.blowHornKgf();
        amit.blowHornTargen();
    }
    
}
