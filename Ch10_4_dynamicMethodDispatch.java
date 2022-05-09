// Dynamic Method Dispatch means creating the Object of subclass from referring Superclass. See line 36 

class Phone{
    public void on(){
        System.out.println("Turning on phone");
    }
    public void Clock(){
        System.out.println("Showing Time");
    }
}
class SmartPhone extends Phone{
    @Override
    public void on(){
        System.out.println("Turning on SmartPhone");
    }
    public void weather(){
        System.out.println("Showing the weather of today");
    }
    public String[] getNetwork() {
        return null;
    }

}



public class Ch10_4_dynamicMethodDispatch {
    public static void main(String[] args){
        // The both two object we created below is alllowed 

        // Phone nokia = new Phone();
        // nokia.on();

        // SmartPhone apple = new SmartPhone();
        // apple.on();


        // but we also create the object which refre superclass to the sub class..
        Phone mi = new SmartPhone(); // It is runtime polymorphisim:- object creation is depend on runtime.
        // SmartPhone mi2 = new Phone();   Not allowed
        mi.on(); // It runs subclass method, because here new SmartPhone is the object and Phone mi is the refrence.
        mi.Clock();
        // mi.weather(); // Not allowed,because it allow to run only those method which is on both the classes. it is called Dynamic Method Dispatch. In this whicch method is run depend upon Runtime.
    }
    
}
