@FunctionalInterface
interface DemoAno{
    void meth1(int a);
    // void meth2();
}
// class AnonyDemo implements DemoAno{
//     public void display(){
//         System.out.println("Hellow");
//     }

//     @Override
//     public void meth1() { 
//         System.out.println("I am meth1");          
//     }

//     @Override
//     public void meth2() {
//         System.out.println("I am meth 2");
//     }

// }
public class Ch16_1_lambda {
    public static void main(String[] args){
        // DemoAno ob = new AnonyDemo();
        // ob.meth1();

        // Anonymous Class
        // DemoAno obj = new DemoAno() { //This is anonymous class which is not realy present
        //     // If we want to use a local class at once then we create anonymous class.

        //     @Override
        //     public void meth1() {
        //         System.out.println("Hey");
                
        //     }

        //     // @Override
        //     // public void meth2() {
        //     //     System.out.println("Hi");
                
        //     // }
            
        // };
        // obj.meth1();


        // Lambda Function

        DemoAno ab = (a)->{
            System.out.println("I am meth1 from this lambda "+a);
        };
        ab.meth1(6);
    }
    
}
