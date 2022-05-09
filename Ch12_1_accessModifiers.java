// In this we use access modifiers in class, package, Subclass, Wrold..

class c1{
    public int x = 5; // You can use this variable anywhere in same or diifferent class and Same or different package
    protected int y =2; // You can use this method anywhere but in the same package
    int z = 6; // use in the same class and in the same package
    // Private method use in the same class and in the same package even if the class is derive another class we can not use there

    protected int a = 7;
    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
    
}

public class Ch12_1_accessModifiers {
    public static void main(String[] args){
        c1 c =new c1();
        // c.meth1();
        System.out.println(c.x);
        System.out.println(c.y);
        System.out.println(c.z);
        System.out.println(c.a);
    }
    
}
