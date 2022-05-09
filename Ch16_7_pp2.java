// Create a interface and generate a instance from it.
interface Myint{
    void display();
}
public class Ch16_7_pp2 {
    public static void main(String[] args){
        Myint i = ()->{
            System.out.println("I am display");
        };
        i.display();
                    
        
    }
    
}
