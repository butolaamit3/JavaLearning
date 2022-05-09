class A{
    public int a;

    public int amit(){
        return 4;

    }

    public void meth2(){
        System.out.println("I am method 2 of class A");
    }
}

class B extends A{
    @Override //this anotation show this method is override..no matter we write thsi annotation or not...
    public void meth2(){
        System.out.println("I am method 2 of class B");
    }

    public void meth3(){
        System.out.println("I am meth3 of class B");
    }
}

public class Ch10_3_methodOveriding {
    public static void main(String[] args){
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
        
        
    }
    
}
