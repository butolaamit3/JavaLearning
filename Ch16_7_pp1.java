// Create a class and add a method with deprecated anotation. What is its effecton program execution.

class MyDeprecated{
    @Deprecated
    void meth1(){
        System.out.println("I am method 1");
    }
}
public class Ch16_7_pp1 {
    @SuppressWarnings("Hey this is used to supress warning")

    public static void main(String[] args){
        MyDeprecated md = new MyDeprecated();
        md.meth1();
    }
    
}
