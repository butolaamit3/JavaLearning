// You can not "extends" a interface in class, you can "implements" it... 


interface parentInterface{
    void meth1();
    void meth2();
}
interface childInterface extends parentInterface{
    void meth3();
    void meth4();

}
class MySampleClass implements childInterface{
    @Override
    public void meth1(){
        System.out.println("Meth1");
    }
    @Override
    public void meth2(){
        System.out.println("Meth2");
    }
    
    @Override
    public void meth3(){
        System.out.println("Meth3");
    }
    @Override
    public void meth4(){
        System.out.println("Meth4");
    }
    
    public void basic(){
        System.out.println("Hey Amit");
    }

}

public class Ch11_3_InheritanceInInterfaces {
    public static void main(String[] args){
        MySampleClass my = new MySampleClass();
        my.meth1();
        my.meth2();
        my.meth3();
        my.meth4();
        my.basic();
        
    }
    
}
