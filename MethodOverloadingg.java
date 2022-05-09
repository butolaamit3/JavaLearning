//Two or more method have same name but different implementation such method are called overloaded method..
public class MethodOverloadingg {
    static void foo(){
        System.out.println("Good Morning Bro");
    }
    static void foo(int a){   // int a is a parameter
        System.out.println("I Love You "+ a);
    }
    public static void main(String[] args){
        foo();
        foo(3000); ///here 3000 is given to a... This is argument and arguments are actual!

    }
    
}
