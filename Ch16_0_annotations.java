//it is a type of annotation in which a Interface contaions only pone method. If more then 1 method found then it shows error
@FunctionalInterface 
interface myFunctionalInterface{
    void thiswMethod();
    // void thisMethod2(); // This shows error because it is functional interface and this is 2nd method

}

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

    @Deprecated
    public void weather(){
        System.out.println("Showing the weather of today");
    }

}


public class Ch16_0_annotations {
    @SuppressWarnings("Deprecation")
    public static void main(String[] args){
        SmartPhone np = new SmartPhone();
        np.weather();
        
        
    }
    
}
